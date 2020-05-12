package com.epam;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;


public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    //private Config config = new JavaConfig("com.epam");
    private Config config;

    public static ObjectFactory getInstance() {return ourInstance;};

    private ObjectFactory() {
        // Так можно писать в 9-ой jave
        //new JavaConfig("com.epam", HashMap<> (Map.of(Policeman.class, AngryPoliceman.class)));

        HashMap<Class, Class> configMap = new HashMap<>();
        configMap.put(Policeman.class, PolicemanImpl.class);

        config = new JavaConfig("com.epam", configMap);
    };

    // В spring'e называется getBean
    @SneakyThrows // т.к. никакие exception'ы мы не хотим обрабатывать
    public <T> T CreateObject(Class<T> type) {
        Class<? extends T> impClass = type;
        if (type.isInterface()) {
            impClass = config.getImplClass(type);
        }

        T t = impClass.getDeclaredConstructor().newInstance();

        for (Field field : impClass.getDeclaredFields()) {
            //У каждого field'а счиитает InjectProperty.class анатацию
            InjectProperty annotation = field.getAnnotation(InjectProperty.class);

            //String path = ClassLoader.getSystemClassLoader().getResource("application.properties").getPath();
            String path = "C:\\Локальные документы\\Work\\IDEAProjects\\IDEAProjects\\JMeetUp\\target\\classes\\application.properties";
            Stream<String> lines = new BufferedReader(new FileReader(path)).lines();
            Map<String, String> propertiesMap = lines.map(line -> line.split("=")).collect(toMap(arr -> arr[0], arr -> arr[1]));

            if (annotation != null ) {
                String value = annotation.value().isEmpty() ? propertiesMap.get(field.getName()) : propertiesMap.get(annotation.value());
                //т.к. поле скорее всего private, делаем
                field.setAccessible(true);
                field.set(t,value);
            }

        }

        return t;
    };
}


