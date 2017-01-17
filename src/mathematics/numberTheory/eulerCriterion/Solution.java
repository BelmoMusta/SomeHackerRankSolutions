package mathematics.numberTheory.eulerCriterion;

/**
 * Created by DELL on 17/01/2017.
 * <a href="https://www.hackerrank.com/challenges/eulers-criterion">Problem statement</a>
 */
 
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {
    public static String isSquareResidue(int a,int m){
        if(a==0) return "YES";
        BigInteger aa = new BigInteger(""+a);
        BigInteger mm = new BigInteger(""+m);
        BigInteger min = new BigInteger(""+((m-1)/2));



        return aa.modPow(min, mm).intValue()==1?"YES":"NO";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println(isSquareResidue(sc.nextInt(), sc.nextInt()));

        }

    }
}