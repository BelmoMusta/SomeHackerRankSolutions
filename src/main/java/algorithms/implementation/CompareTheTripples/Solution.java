package algorithms.implementation.CompareTheTripples;

import java.util.Scanner;

/**
 * Created by DELL on 29/11/2016.
 *<a href="a href="https://www.hackerrank.com/challenges/compare-the-triplets">Problem statement</a>
 */
public class Solution {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int A = (a0>b0?1:0)+(a1>b1?1:0)+(a2>b2?1:0);
        int B = (a0<b0?1:0)+(a1<b1?1:0)+(a2<b2?1:0);

        System.out.printf("%d %d",A, B);

    }
}
