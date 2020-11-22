package com.epam;

import lombok.Getter;
import org.reflections.Reflections;

import java.util.Map;
import java.util.Set;

public class JavaConfig implements Config {

    @Getter
    private Reflections scanner;
    private Map<Class,Class> ifc2ImplClass;

    public JavaConfig(String packageToScan, Map<Class,Class> ifc2ImplClass) {
        this.ifc2ImplClass = ifc2ImplClass;
        this.scanner = new Reflections(packageToScan);
    }

    @Override
    public <T> Class<? extends T> getImplClass(Class<T> ifc) {

        // Лямда запускается, когда в Map'е нету ничего
        // Принимает на вход ключ и если ключ существует возвращает значение для этого ключа.
        // Если ключ не существует, то запускает лямду. Зачение "засетится" в Map'у  и вернется нам.
        return ifc2ImplClass.computeIfAbsent(ifc, aClass -> {
            Set<Class<? extends T>> classes = scanner.getSubTypesOf(ifc);
            if (classes.size()!=1) {
                throw new RuntimeException(ifc + " has 0 or more than one imp please update your config");
            }
            return classes.iterator().next();
        });

    }
}
