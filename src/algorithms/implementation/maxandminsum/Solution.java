//

package algorithms.implementation.maxandminsum;


import java.util.Arrays;
import java.util.Scanner;


/**
 * Created by DELL on 30/11/2016.
 * <a href="https://www.hackerrank.com/challenges/mini-max-sum">Problem statement</a>
 */
public class Solution {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long[] a = new long[5];


        for (int i = 0; i < 5; i++) {

            a[i]=sc.nextLong();


        }

        Arrays.sort(a);
long min =0l;
long max =0l;
        for (int i = 0; i <4 ; i++) {
            min+=a[i];
            max+=a[i+1];
        }

        System.out.printf("%d %d ",min, max);


    }

}




