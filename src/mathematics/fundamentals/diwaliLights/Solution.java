package mathematics.fundamentals.diwaliLights;

/**
 * Created by DELL on 10/12/2016.
 * <a href="https://www.hackerrank.com/challenges/diwali-lights">Problem statement</a>
 */

import java.math.BigInteger;
import java.util.*;

public class Solution {
    static int diwaliLights(int n){
        BigInteger nn = new BigInteger(""+(n));
        BigInteger two = new BigInteger(""+2);
        BigInteger modulo = new BigInteger("100000");

        return two.modPow(nn, modulo).subtract(BigInteger.ONE).intValue();


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println( diwaliLights(sc.nextInt()));

        }
    }
}