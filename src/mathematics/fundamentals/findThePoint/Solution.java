package mathematics.fundamentals.findThePoint;

/**
 * Created by DELL on 17/01/2017.
 * <a href="https://www.hackerrank.com/challenges/find-point"> Problem statement </a>
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] TS = new int[T][4];
        for (int i = 0; i < T; i++) {
            TS[i][0] = sc.nextInt();
            TS[i][1] = sc.nextInt();
            TS[i][2] = sc.nextInt();
            TS[i][3] = sc.nextInt();


        }
        for (int i = 0; i < T; i++) {
            System.out.println((2*TS[i][2]-TS[i][0])+ " " +(2*TS[i][3]-TS[i][1]));


        }
    }
}