package mathematics.fundamentals.minimumhighttriangles;

/**
 * Created by DELL on 10/12/2016.
 * <a href="https://www.hackerrank.com/challenges/lowest-triangle/problem">Problem statement</a>
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {


     private  int lowestTriangle(int base, int area){

         return (int) (Math.ceil(2*(double)area/base));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

         Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int area = in.nextInt();
        int height = solution.lowestTriangle(base, area);
        System.out.println(height);





    }
}