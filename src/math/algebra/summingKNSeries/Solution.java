package math.algebra.summingKNSeries;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by DELL on 08/12/2016.
 */
public class Solution {


    static final BigInteger mod = new BigInteger(1000000007+"");

    static double bernouilli(int n) {
        double[] A = new double[n + 1];
        for (int m = 0; m <= n; m++) {
            A[m] = (double) (1 / (m + 1));
            for (int j = m; j >= 1; j--)
                A[j - 1] = (A[j - 1]-(A[j]))*(j);
        }
        return A[0];
    }

    public static void main(String[] args) {

        System.out.println();

  /*     Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        




        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long d= (long) ((1-Math.pow(n,k))/(1-n));

            System.out.println(d);

          //  System.out.println(pow2(n+1));
        }
*/



    }
    
}
