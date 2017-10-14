package mathematics.fundamentals.handshake;

/**
 * Created by DELL on 17/01/2017.
 * <a href="https://www.hackerrank.com/challenges/handshake"> Problem statement</a>
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int tests = sc.nextInt();
        for(int i=0;i<tests;i++){
            long n = sc.nextLong();
            System.out.println((n-1)*n/2);


        }
    }
}