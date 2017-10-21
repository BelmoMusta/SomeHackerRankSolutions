package algorithms.implementation.grading;

/**
 * Created by DELL on 21/10/2017.
 */


/**
 * <a href="https://www.hackerrank.com/challenges/grading/problem"> Problem statement</a>
 */

import java.util.Scanner;

public class Solution {

    static int[] solve(int[] grades) {

        for (int i = 0; i < grades.length; i++) {
               int nextMultOf5= ( grades[i]/5 + 1 )*5;

            if( grades[i]>=38 && nextMultOf5 - grades[i] < 3){

                    grades[i] = nextMultOf5;

            }
        }
        return grades;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
