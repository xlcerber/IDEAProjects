package io.hexlet.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//public class CollectionsHelper<T extends Human> {
public class CollectionsHelper {

    // findFirstIndex
    // BEGIN (write your solution here)
    public static <T> int findFirstIndex (final ArrayList<T> items, T object) {
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
    public static <T> int findLastIndex (final ArrayList<T> items, T object) {
        return items.lastIndexOf(object);
    }
    // END


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

