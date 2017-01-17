
package javaProblems.exceptions;

import java.util.Scanner;

/**
 * Created by DELL on 29/11/2016.
 * <a href="https://www.hackerrank.com/challenges/java-exception-handling">Problem statement</a>
 */

public class Solution {

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

        try {

            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(x/y);

        }
        catch (java.util.InputMismatchException e){

            System.out.println("java.util.InputMismatchException");


        }

        catch (ArithmeticException ee){

            System.out.println("java.lang.ArithmeticException: / by zero");

        }

    }
}
