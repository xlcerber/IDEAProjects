package io.hexlet.java.list;

import java.util.*;

class ArrayList implements IList {
    // BEGIN (write your solution here)

    private static final Object[] EMPTY_ELEMENTDATA = {};
    private Object[] elementData;
    private int size = 0;

    public ArrayList() {
        this.elementData = EMPTY_ELEMENTDATA;
    }

    // END

    public synchronized void add(final Object element) {
        // BEGIN (write your solution here)
        elementData = Arrays.copyOf(elementData, size + 1);
        elementData[size++] = element;
        // END
    }

    public synchronized void removeLast() {
        // BEGIN (write your solution here)

////        int index = elementData.length - 1;
//        int numMoved = size - index - 1;
//        if (numMoved > 0)
//            elementData = Arrays.copyOf(elementData, size + 1);
//            System.arraycopy(elementData, index+1, elementData, index, numMoved);

        if (size > 0) elementData[--size] = null;

        // END
    }

    public int size() {
        // BEGIN (write your solution here)
        return size;
        // END
    }

    public Object get(final int index) {
        // BEGIN (write your solution here)
        if (index >= 0 && index < size) { return elementData[index]; }

        return null;

        // END
    }

    public synchronized void set(final int index, final Object object) {
        // BEGIN (write your solution here)
        elementData[index] = object;
        // END
    }

}

