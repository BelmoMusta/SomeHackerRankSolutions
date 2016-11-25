
package easysum;

import java.util.*;


 

/**
 *
 * @author Belmostapha
 */
public class Solution {
 static int EsaySum(long N,long m){
 int sum=0;
     for (int i = 1; i <= N; i++) {
         sum+=(i%m);
     }
 return sum;
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (T < 0 || T > 1000) {
            System.err.println("ERROR");
        } else {
            int[][] TS = new int[T][2];
            for (int i = 0; i < T; i++) {
                TS[i][0] = sc.nextInt();
                TS[i][1] = sc.nextInt();
            }
            for (int i = 0; i < T; i++) {
                 System.out.println(EsaySum(TS[i][0],TS[i][1]));

            }
        }
   
       }
}

