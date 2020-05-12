package com.epam;

public class ConsoleAnnouncer implements Announcer {
    //private int volume;
    public void announce(String message) {
        System.out.println(message);
    }
}
