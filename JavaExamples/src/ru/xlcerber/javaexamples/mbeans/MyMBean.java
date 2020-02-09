package ru.xlcerber.javaexamples.mbeans;

public interface MyMBean {

    void writeToConsole(String message);

    String concat(String str1, String str2);

    String getMyName();

    int getSomeValue();

    void setSomeValue(int someValue);

}
