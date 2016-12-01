package math.fillingjars;

import java.util.Scanner;

/**
 * Created by DELL on 27/11/2016.
 */
public class Solution {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long M = sc.nextLong();
        long somme=0;

        while(M>0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long k = sc.nextLong();

            somme+=(b-a+1)*k;
            M--;
        }
        System.out.println(somme/N);

    }

}


