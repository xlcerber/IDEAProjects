package io.hexlet.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String... args) {
        final CollectionsHelper collectionsHelper = new CollectionsHelper();

        ArrayList<String> al =  new ArrayList<>();
        al.add("Слава");
        al.add("Максим");
        al.add("Глеб");
        al.add("Слава");

       int i1 = CollectionsHelper.findFirstIndex(al,"Максим");
       int i2 = CollectionsHelper.findLastIndex(al,"Слава");

    }

}
