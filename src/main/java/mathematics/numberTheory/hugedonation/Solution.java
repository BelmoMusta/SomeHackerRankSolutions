package mathematics.numberTheory.hugedonation;

import java.io.*;
import java.util.*;

/**
 * <a href="https://www.hackerrank.com/challenges/little-chammys-huge-donation">Problem statement</a>
 */


public class Solution {

    static long getCandies(long n){

        long y=1;
        long count =0;
        long s=0;
        while((s+=(y*y))<=n){
            y++;
            count++;
        }
        return   count ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {

            System.out.println(getCandies(sc.nextLong()));

        }
    }
}