/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TriangleNumbers;
import java.util.*;

/**
 *
 * @author Belmostapha
 */
public class Solution {
    
    
         
   
     private static int TheFirstEvenNumberAt(int N){
          
          long[][] M =ConstructTriangle(N);
          
           for (int i = 0; i < M.length; i++) {
               for (int j = 0; j < M[i].length; j++) {
                   if(i==N-1 && M[i][j]%2==0)return j+1; 
               }
           }
    return -1;
    }
     
      private static long[][] ConstructTriangle(int height){
        long[][] M = new long[height][2*height-1];
        M[0][height-1]=1;
        for (int i = 1; i < height; i++) {
            for (int j = 0; j < 2*height-1; j++) {
                long x,y,z;
                x=j==0?0:M[i-1][j-1];
                y=M[i-1][j];
                z=j==2*height-2?0:M[i-1][j+1];
                 M[i][j]=x+y+z;
            }
        }
     return M;
      }
          private static long[][] ConstructPascalTriangle(int height){
        long[][] M = new long[height][2*height-1];
        M[0][height-1]=1;
        for (int i = 1; i < height; i++) {
            for (int j = 0; j < 2*height-1; j++) {
                long x,y,z;
                x=j==0?0:M[i-1][j-1];
                y=-1;
                z=j==2*height-2?0:M[i-1][j+1];
                 M[i][j]=x+z;
            }
        }
     return M;
      }
    public static void main(String[] args) {
        showTriangle(ConstructPascalTriangle(50));
      /*  Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (T <= 0 || T > 100) {
            System.err.println("ERROR");
        } else {
            int[] TS = new int[T];
            for (int i = 0; i < T; i++) {
                TS[i] = sc.nextInt();
            }
            for (int i = 0; i < T; i++) {
                  System.out.println(TheFirstEvenNumberAt(TS[i]));
            }
        }
              */
       }
    static void showTriangle(long [] [] M){
    for (long[] is : M) {
        for (int i = 0; i < is.length; i++) {
           if(is[i]==0) System.out.print("   "); 
           else   if(is[i]==-1) System.out.print(""); 
           else System.out.print(" "+is[i]+" ");
            
        }
        System.out.println("");
                
    }
        
    
    } 
}
 