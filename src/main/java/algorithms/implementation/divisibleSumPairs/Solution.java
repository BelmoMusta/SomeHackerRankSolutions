package algorithms.implementation.divisibleSumPairs;

/**
 * Created by DELL on 17/01/2017.
 * <a href="https://www.hackerrank.com/challenges/divisible-sum-pairs">Problem statement</a>
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int counter=0;
        for(int y=0;y<n;y++){

            for(int yy=0;yy<y;yy++){

                if((a[y]+a[yy])%k==0){

                    counter++;

                }


            }

        }

        System.out.printf("%d",counter);

    }
}
