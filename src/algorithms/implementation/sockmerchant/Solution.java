package algorithms.implementation.sockmerchant;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by DELL on 04/12/2016.
 * <a href="https://www.hackerrank.com/challenges/sock-merchant">Problem statement</a>
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];

        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        Arrays.sort(c);
int current=c[0],
        count=1;
int tab[] = new int[c.length];

        int u=0;
        tab[0]++;

        int out=0;
        while(count<c.length){

           if(current!=c[count]) {

               u++;
           }
           tab[u]++;
           current=c[count];
           count++;

       }



        for (int i = 0;i<tab.length; i++) {
           if(tab[i]==0) break;
            out+=tab[i]/2;

        }

        System.out.printf("%d",out);
    }
}
