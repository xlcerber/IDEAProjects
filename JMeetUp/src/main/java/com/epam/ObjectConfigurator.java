package com.epam;

// В spring'e называется BeanPostProcessor
public interface ObjectConfigurator {
    void configure(Object t);
}
