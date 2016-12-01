package jv.outputformatter;

import java.util.Scanner;

/**
 * Created by DELL on 29/11/2016.
 */
public class Solution {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line

            System.out.printf( "%-15s%03d %n", s1, x);


        }
        System.out.println("================================");

    }
}
