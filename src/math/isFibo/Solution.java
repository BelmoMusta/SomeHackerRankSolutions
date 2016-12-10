package math.isFibo;

/**
 * Created by DELL on 10/12/2016.
 * https://www.hackerrank.com/challenges/is-fibo
 */

import java.util.*;

public class Solution {
    static Map<Long,Long> map= new LinkedHashMap();

    public static void fill(){

        for(long i=0;i<=100000;i++){
            map.put(fib(i),i);
        }

    }


    public static long fib(long n) {

        if (n <= 0)
            return 0;

        long i = (int) (n - 1);
        long a = 1, b = 0, c = 0, d = 1, tmp1,tmp2;

          while (i > 0) {
            if (i % 2 != 0) {
                tmp1 = d * b + c * a;
                tmp2 = d * (b + a) + c * b;
                a = tmp1;
                b = tmp2;
            }

            tmp1 = (long) (Math.pow(c, 2) + Math.pow(d, 2));
            tmp2 = d * (2 * c + d);

            c = tmp1;
            d = tmp2;

            i = i / 2;

        }
        return a + b;
    }


    public static void main(String[] args) {
        fill();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); // test cases
        for (int i = 0; i < n; i++) {
            if(map.get(sc.nextLong())==null) System.out.println("IsNotFibo");
            else System.out.println("IsFibo");
        }

    }

}
