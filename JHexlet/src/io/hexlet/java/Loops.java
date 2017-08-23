package io.hexlet.java;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Loops {

    public int[][] triangleArray(final int limit) {

        int[][] array = new int[limit + 1][];
        array[0] = null;

        for (int i = 1; i <= limit; i++) {
            int [] jArray = new int[i];
            for (int j = 0; j < i ; j++) {
                jArray[j] = i;
            }
            array[i] = jArray;
        }

        return array;

    }

    public int findIndex(final int[] m, final int target) {

        int index = 0;

        for (int number : m ) {
            if (number == target) { return index;}
            index++;
        }
        return -1;

    }

    void replaceElement(final int[] m, final int a, final int b) {

        int index = 0;

        for (int number : m ) {
            if (number == a) {
                m[index] = b;
            }
            index++;
        }

    }
}
