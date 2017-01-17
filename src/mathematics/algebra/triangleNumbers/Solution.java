package mathematics.algebra.triangleNumbers;

/**
 * Created by DELL on 17/01/2017.
 * <a href="https://www.hackerrank.com/challenges/triangle-numbers">Problem statement</a>
 */
import java.io.*;
import java.util.*;

public class Solution {

    private static int calculate(int n){

        if(n%4==0) return 3;
        if(n%4==1) return 2;
        if(n%4==2) return 4;
        if(n%4==3) return 2;
        
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (T <= 0 || T > 100) {
            System.err.println("ERROR");
        } else {
            int[] TS = new int[T];
            for (int i = 0; i < T; i++) {
                TS[i] = sc.nextInt();
            }
            for (int i = 0; i < T; i++) {
                System.out.println(calculate(TS[i]));
            }
        }
    }
}