package mathematics.fundamentals.maximumDraws;

/**
 * Created by DELL on 17/01/2017.
 * <a href="https://www.hackerrank.com/challenges/maximum-draws"> Problem statement</a>
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[][] TS = new int[T][1];
        for (int i = 0; i < T; i++) {
            TS[i][0] = sc.nextInt();

        }
        for (int i = 0; i < T; i++) {
            System.out.println(1*TS[i][0]+1);

        }

    }
}
