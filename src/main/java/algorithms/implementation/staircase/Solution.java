package algorithms.implementation.staircase;

import java.util.Scanner;

/**
 * Created by DELL on 29/11/2016.
 *<a href="https://www.hackerrank.com/challenges/staircase">Problem statement</a>
 */
public class Solution {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int i=0;

         while(++i<=n){


             for (int y=0;y<n;y++){
                 if(y<n-i)
                 System.out.print(" ");

                  else System.out.print("#");

             }

             System.out.println();
         }



    }
}
