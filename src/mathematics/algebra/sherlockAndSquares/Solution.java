package mathematics.algebra.sherlockAndSquares;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by DELL on 08/12/2016.
 * <a href="https://www.hackerrank.com/challenges/sherlock-and-square">Problem statement</a>
 */
public class Solution {


    static final BigInteger mod = new BigInteger(1000000007+"");

    static BigInteger pow2(long n){
     BigInteger two  = new BigInteger("2");

        return  two.modPow(new BigInteger((n)+""),mod).add(two);

    }

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            long n = sc.nextInt();

            System.out.println(pow2(n+1));
        }




    }
}
