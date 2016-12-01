package jv.loops;

import java.util.Scanner;

/**
 * Created by DELL on 29/11/2016.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n= sc.nextInt();

        int i=1;

        while(i<11){
            System.out.printf("%d x %d = %d\n", n, i, n * i);


i++;

        }
    }
}
