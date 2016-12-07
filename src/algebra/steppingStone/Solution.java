package algebra.steppingStone;

import java.util.Scanner;

/**
 * Created by DELL on 06/12/2016.
 *https://www.hackerrank.com/challenges/stepping-stones-game
 */
public class Solution {

    static boolean isAnormalDelta(long m ){

        long n=1+8*m;
        long sqr= (long) Math.sqrt(n);
        return  sqr*sqr==n;

    }

    static long isGaussianSum(long n){

        if(!isAnormalDelta(n)) return -1;
    return (long) ((-1+Math.sqrt(1+8*n))/2);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();

     long h=isGaussianSum(n);

            if(h!=-1)
                System.out.printf("Go On Bob "+(h));
            else
                System.out.printf("Better Luck Next Time\n");
        }

    }
}