package com.epam;

public class ConsoleAnnouncer implements Announcer {
    //private int volume;
    private Recommendator recommendator = ObjectFactory.getInstance().CreateObject(Recommendator.class);

    @Override
    public void announce(String message) {
        System.out.println(message);
        recommendator.recommend();
    }
}
