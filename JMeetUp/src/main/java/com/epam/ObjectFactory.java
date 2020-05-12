package com.epam;

import lombok.SneakyThrows;

import java.lang.invoke.SerializedLambda;
import java.util.HashMap;


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

        //todo

        return t;
    };
}


