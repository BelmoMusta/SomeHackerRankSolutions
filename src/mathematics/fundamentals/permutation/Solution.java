package mathematics.fundamentals.permutation;

import java.util.Scanner;

/**
 * Created by DELL on 10/12/2016.
 */
public class Solution {

static  final long mod= (long) (1e9+7);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            long n = sc.nextLong();
            long m = sc.nextLong();

            System.out.println(possibilities(n-1,m));
        }
    }

    private static long possibilities(long n, long m) {
        return 0;
    }

    static long factorial(long n){


        long res = 1 ;


        for (long i = 1; i <n ; i++) {

            res*=i;

        }

        return  res ;
    }
}
