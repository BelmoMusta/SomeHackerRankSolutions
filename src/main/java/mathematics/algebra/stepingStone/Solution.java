package mathematics.algebra.stepingStone;

/**
 * Created by DELL on 07/12/2016.
 * <a href="https://www.hackerrank.com/challenges/stepping-stones-game">Problem statement</a>
 */
import java.util.*;

public class Solution {
   public static boolean isAPerfectSquare(long m){

        long n=1+8*m;
        long sqr= (long) Math.sqrt(n);

        return  sqr*sqr==n;

    }

    static long isAtriangularNumber(long n){

        if(!isAPerfectSquare(n)) return -1;


        return (long) ((-1+Math.sqrt(1+8*n))/2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();

            long h= isAtriangularNumber(n);

            if(h!=-1)

                System.out.printf("Go On Bob %d\n",(h));
            else
                System.out.printf("Better Luck Next Time\n");

        }

    }
}