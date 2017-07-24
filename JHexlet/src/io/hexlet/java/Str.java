package io.hexlet.java;

/**
 * Created by lissenok on 24.07.2017.
 */
 import java.util.*;

public class Str {

    /** invert the string
     * 	example:
     *	- input: "input string"
     *	- output: "gnirts tupni"
     **/
    public String task1(final String in) {
        // BEGIN (write your solution here)

        StringBuilder sb = new StringBuilder(in.length());

        for (int i = in.length()-1; i >= 0; i--) {
            sb.append(in.charAt(i));
        }

        return sb.toString();
        // END
    }

    /** invert the tokens int the string
     * 	example:
     *	- input: "input string to the method test2"
     *	- output: "tupni gnirts ot eht dohtem 2tset"
     **/
    public String task2(final String in) {
        // BEGIN (write your solution here)
        int n = 0;
        int endIndex;

        StringBuilder sb = new StringBuilder(in.length());

        do {
            endIndex = in.indexOf(' ',n );
            if (endIndex == -1) { endIndex = in.length(); }

            sb.append(task1(in.substring(n,endIndex))).append(" ");

            n = in.indexOf(' ', n) + 1;

        } while (endIndex != in.length());

        return sb.toString().trim();
        // END
    }

    /** count the target character in the String
     * 	example:
     *	- input: "input string to the method test2", 't'
     *	- output: 7
     **/
    public int task3(final String in, final char target) {
        // BEGIN (write your solution here)
        int count = 0;

        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == target) count = count + 1;
        }

        return count;
        // END
    }

}


