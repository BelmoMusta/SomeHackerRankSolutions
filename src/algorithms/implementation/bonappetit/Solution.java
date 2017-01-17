package algorithms.implementation.bonappetit;

import java.util.Scanner;

/**
 * Created by DELL on 04/12/2016.
 * <a href="https://www.hackerrank.com/challenges/bon-appetit">Problem statement</a>
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int k = sc.nextInt();
int sum=0;
        for (int i = 0; i < n; i++) {
            int p=sc.nextInt();;
            if(i!=k) sum+=p;
        }

int charged = sc.nextInt();
        if(charged==sum/2) System.out.println("Bon Appetit");

        else System.out.printf("%d\n",charged-sum/2);
    }
}
