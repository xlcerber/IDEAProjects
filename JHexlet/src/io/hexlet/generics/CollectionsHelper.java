package io.hexlet.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//public class CollectionsHelper<T extends Human> {
public class CollectionsHelper {

    // findFirstIndex
    // BEGIN (write your solution here)
    public static <T> int findFirstIndex (final List<T> items, T object) {
        //int tmp = items.indexOf(object);

        for (int i = 0; i < items.size(); i++) {
            if ( items.get(i) == object)   {
                return i;
            }
        }
       return -1;
    }
    // END

    // findLastIndex
    // BEGIN (write your solution here)
    public static <T> int findLastIndex (final List<T> items, T object) {
        return items.lastIndexOf(object);
    }
    // END

    // findFirstIndex
    public int findFirstIndex1(final List<? extends Human> humans, final String namePrefix) {
        int i = 0;
        for (Human human : humans) {
            if (human.getName().startsWith(namePrefix)  ) {
                return i;
            }
            i++;
        }
        return -1;
    }



//    public T findFirst(final List<T> humans, final String namePrefix, final Sex sex) {
//        //BEGIN (write your solution here)
//        int i = 0;
//        for (T item : humans) {
//            if (item.getSex() == sex && item.getName().startsWith(namePrefix)  ) {
//                return item;
//            }
//            i++;
//        }
//        return null;
//        //END
//    }


}

