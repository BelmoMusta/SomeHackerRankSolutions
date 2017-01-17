package mathematics.fundamentals.specialMultiple;

/**
 * Created by DELL on 17/01/2017.
 * <a href="https://www.hackerrank.com/challenges/special-multiple">Problem statement</a>
 */
import java.io.*;
import java.util.*;

public class Solution {
    static long nineAndZeros(long n){
        long i=1;
        long temp=0;

        while(true){

            temp= Long.parseLong(Long.toBinaryString(i++))*9;
            if(temp%n==0) break;

        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(nineAndZeros(sc.nextInt()));

        }

    }
}