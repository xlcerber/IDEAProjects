package com.epam;

import lombok.SneakyThrows;

import java.lang.invoke.SerializedLambda;

public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig("com.epam");

    public static ObjectFactory getInstance() {return ourInstance;};

    private ObjectFactory() {

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


