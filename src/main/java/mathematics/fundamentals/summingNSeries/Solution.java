package mathematics.fundamentals.summingNSeries;

/**
 * Created by DELL on 17/01/2017.
 * <a href="https://www.hackerrank.com/challenges/summing-the-n-series">Problem statement </a>
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static long sumNseries(long n){
        // Sn= sum(n^2-(n^2-1) = n^2

        long nn=n%1000000007;
        long nnn =n%1000000007;

        return (nn*nnn)%1000000007;

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {

            System.out.println(sumNseries(sc.nextLong()));

        }


    }
}