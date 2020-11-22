package com.epam;

public class CoronaDesinfector {
    //private Announcer announcer = new ConsoleAnnouncer();
    //private Policeman policeman = new PolicemanImpl();

    private Announcer announcer = ObjectFactory.getInstance().CreateObject(Announcer.class);
    private Policeman policeman = ObjectFactory.getInstance().CreateObject(Policeman.class);

    public CoronaDesinfector() {
    }

    public void start(Room room) {
        announcer.announce("Начинаем дезинфекцию, все вон!");
        policeman.makePeopleLeaveRoom();
        desinfect(room);
        announcer.announce("Рискните зайти обратно");
    }

    private void desinfect(Room room) {
        System.out.println("зачитывается молитва: 'корона изыди!'");
    }
}
