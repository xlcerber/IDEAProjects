package com.epam;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;


public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private List<ObjectConfigurator> configurators = new ArrayList<>();
    //private Config config = new JavaConfig("com.epam");
    private Config config;

    public static ObjectFactory getInstance() {return ourInstance;}

    @SneakyThrows
    private ObjectFactory() {
        // Так можно писать в 9-ой jave
        //new JavaConfig("com.epam", HashMap<> (Map.of(Policeman.class, AngryPoliceman.class)));

        HashMap<Class, Class> configMap = new HashMap<>();
        configMap.put(Policeman.class, PolicemanImpl.class);

        config = new JavaConfig("com.epam", configMap);
        for (Class<? extends ObjectConfigurator> aClass : config.getScanner().getSubTypesOf(ObjectConfigurator.class)) {
            configurators.add(aClass.getDeclaredConstructor().newInstance());
        }

    }

    // В spring'e называется getBean
    @SneakyThrows // т.к. никакие exception'ы мы не хотим обрабатывать
    public <T> T CreateObject(Class<T> type) {
        Class<? extends T> impClass = type;
        if (type.isInterface()) {
            impClass = config.getImplClass(type);
        }

        T t = impClass.getDeclaredConstructor().newInstance();

        return t;
    }
}


