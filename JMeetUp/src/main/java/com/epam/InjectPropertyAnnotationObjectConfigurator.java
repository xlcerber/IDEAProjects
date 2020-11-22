package com.epam;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class InjectPropertyAnnotationObjectConfigurator implements ObjectConfigurator {
    private    Map<String, String> propertiesMap;

    @SneakyThrows
    public InjectPropertyAnnotationObjectConfigurator() {

        //String path = ClassLoader.getSystemClassLoader().getResource("application.properties").getPath();
        String path = "C:\\Локальные документы\\Work\\IDEAProjects\\IDEAProjects\\JMeetUp\\target\\classes\\application.properties";
        Stream<String> lines = new BufferedReader(new FileReader(path)).lines();
        propertiesMap = lines.map(line -> line.split("=")).collect(toMap(arr -> arr[0], arr -> arr[1]));

    }

    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> impClass = t.getClass();

        for (Field field : impClass.getDeclaredFields()) {

            //У каждого field'а счиитает InjectProperty.class анатацию
            InjectProperty annotation = field.getAnnotation(InjectProperty.class);

            if (annotation != null ) {
                String value = annotation.value().isEmpty() ? propertiesMap.get(field.getName()) : propertiesMap.get(annotation.value());
                //т.к. поле скорее всего private, делаем
                field.setAccessible(true);
                field.set(t,value);
            }
        }
    }
}
