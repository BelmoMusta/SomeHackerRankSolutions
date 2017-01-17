/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathematics.numberTheory.closestNumber;

import java.util.Scanner;

/**
 *
 * @author Belmostapha
 * 
 * <a href="https://www.hackerrank.com/challenges/closest-number">Problem statement</a>
 */
public class Solution {
    static int ClosestMultipleOfXToY(double y , int x){
    int multiple =0;
    int i=1;
    while(Math.abs(i*x-y)<Math.abs(multiple-y)){
        multiple=i*x;
    i++;
    
    }
    
    return multiple;
    }
    public static void main(String[] args) {
      // System.out.println(ClosestMultipleOfXToY(4, ));
      Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] TS = new int[T][3];
            for (int i = 0; i < T; i++) {
                TS[i][0] = sc.nextInt();
                TS[i][1] = sc.nextInt();
                TS[i][2] = sc.nextInt();
                 
            }
            for (int i = 0; i < T; i++) {
                 System.out.println(ClosestMultipleOfXToY(Math.pow(TS[i][0],TS[i][1]), TS[i][2]));
                 

            }
    }
}
/*


Problem Statement

You are given 3 numbers a, b and x. You need to output the multiple of x which is closest to a^b. 
If more than one answer exists , display the smallest one.

Input Format
The first line contains T, the number of test cases.
T lines follow, each line contains 3 space separated integers (a, b and x respectively)

Output Format
For each test case , output the multiple of x which is closest to ab

Constraints
1 ≤ T ≤ 105
1 ≤ x ≤ 109
0 < ab ≤ 109
1 ≤ a ≤ 109
-109 ≤ b ≤ 109

Sample Input

3
349 1 4
395 1 7
4 -2 2
Sample Output

348
392
0
Explanation

The closest multiple of 4 to 349 is 348.
The closest multiple of 7 to 395 is 392.
The closest multiple of 2 to 1/16 is 0.*/