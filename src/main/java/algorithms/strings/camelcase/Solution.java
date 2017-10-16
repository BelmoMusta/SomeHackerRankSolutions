package algorithms.strings.camelcase;

import java.util.Scanner;

/**
 * Created by DELL on 17/10/2017.
 *
 * https://www.hackerrank.com/challenges/camelcase/problem
 */
public class Solution {

    static int countWordsInCamelCaseString(String src){


        if(src==null || src.isEmpty()) return 0;

        int nb=1;

        for (int i = 0; i < src.length(); i++) {
            char c= src.charAt(i);

            if(c>='A' && c<='Z') nb++;
        }

        return nb;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(countWordsInCamelCaseString(s));
    }
}
