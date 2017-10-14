package mathematics.numberTheory.littlePandaPower;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;


/**
 * @author DELL
 * <a href="https://www.hackerrank.com/challenges/littlepandapower">Problem statement</a>
 */
public class Solution {

    public static int isSquareResidue(int a,int b, int x){
        if(a==0) return 0;
        BigInteger aa = new BigInteger(""+a);
        BigInteger bb = new BigInteger(""+b);
        BigInteger xx = new BigInteger(""+x);



        return aa.modPow(bb, xx).intValue();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println(isSquareResidue(sc.nextInt(), sc.nextInt(),sc.nextInt()));

        }
    }
}
