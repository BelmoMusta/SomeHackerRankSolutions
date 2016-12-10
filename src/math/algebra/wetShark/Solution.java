package math.algebra.wetShark;

/**
 * Created by DELL on 07/12/2016.
 * https://www.hackerrank.com/challenges/wet-shark-and-42
 */

import java.io.*;

import java.util.*;



public class Solution {



    static boolean is42(long s){
        if((s&1)==1) return false;

        if(s%3==0 && s%7==0) return true;
        return false;
    }

    static long stepsUntil(long s){
        long y=1;
        long x=0;
        while(s>x){
            y++;
            if(!is42(y) && (((y)%2==0)||((y)%4==0))  ){
                x++;
            }
            //if(s==0) break;

        }
        return y%1000000007;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long t=sc.nextLong();
        /*for (int i = 0; i < t; i++) {

           System.out.println(stepsUntil(sc.nextLong()));


        }*/

        System.out.println(twoOrFour(t));
    }

    static long twoOrFour(long s ){


        Set<Long> res = new HashSet<>();


        for (long i = 0; i <=s ; i+=2) {
            res.add(i);
        }

        for (long i = 0; i <=s ; i+=4) {
            res.add(i);
        }

        for (long i = 0; i <=s ; i+=42) {
            res.add(i);
        }
        return  res.size();
    }



}
