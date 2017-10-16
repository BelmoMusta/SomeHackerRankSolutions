package algorithms.strings.duplicates;

import java.util.*;

/**
 * <a href="https://www.hackerrank.com/challenges/reduced-string/">Problem statement</a>
 */

public class Solution {
    static String removeRepeatedChars(String s) {

        int[] result = containsRepeatedChars(s);

        StringBuilder sb = new StringBuilder(s);
        String ss = s;

        if (result[0] == 1) {

            ss = sb.delete(result[1], result[1] + 2).toString();

        }
        return ss;
    }

    static int[] containsRepeatedChars(String s) {

        int[] ret = new int[2];

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {
                ret[0] = 1;
                ret[1] = i;


                break;

            }


        }
        return ret;


    }

    static String superReducedString(String s){


        String ss = s;

        while (containsRepeatedChars(ss)[0] == 1) {

            ss = removeRepeatedChars(ss);


        }

        return ss.isEmpty() ? "Empty String" : ss;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = superReducedString(s);
        System.out.println(result);
    }
}
