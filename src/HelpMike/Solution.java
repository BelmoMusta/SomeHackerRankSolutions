/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HelpMike;

import java.util.Scanner;

/**
 *
 * @author Belmostapha
 */
public class Solution {
    static int DividedSum(int[] N,int k){
    int sum=0;
        for (int i = 0; i < N.length; i++) {
             for (int j = 0; j < N.length; j++) {
                 if(i<j){
                 if((N[i]+N[j])%k==0) sum++;
                 
                 }
            } 
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (T < 0 || T > 1000) {
            System.err.println("ERROR");
        } else {
          int[][] TS = new int[T][2];
          
            for (int i = 0; i < T; i++) {
                 TS[i][0]=sc.nextInt();
                 TS[i][1]=sc.nextInt();
            }
            for (int i = 0; i < T; i++) {
                  int[] N= new int[TS[i][0]]; 
                  for (int j = 1; j <=N.length; j++) {
                     N[j-1]=j;
                    
                }
                   
                 System.out.println(DividedSum(N,TS[i][1]));

            

            }
        }
    }
}
