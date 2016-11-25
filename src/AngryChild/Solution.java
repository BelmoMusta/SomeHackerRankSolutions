
package AngryChild;

 
import java.util.*;


 

/**
 *
 * @author Belmostapha
 */
public class Solution {
    
    
  private  static int[][] split( int k,int[] N){
    int[][] sp= new int[2][];
    sp[0]= new int[k];
    sp[1]= new int[N.length-k];
        for (int i = 0; i < k; i++) {
            sp[0][i]=N[i];
        }
         for (int i = k; i < N.length; i++) {
            sp[1][i-k]=N[i];
        }
    return sp;
    }
  
    static int[] calculatMinUnfairness( int K , int[] N){
        int[] sp2=split(K,N)[0];
          int[] sp1=split(K,N)[1];
        int[] kk = new int[Combination(K, N.length)];
        for (int i = 0; i < kk.length; i++) {
           kk[i]=-1;
            
        }
        int k=0;
        for (int i = 0 ; i <sp2.length; i++) 
            for (int j = 0; j <sp1.length; j++) {
          
            int temp=sp1[j];
            sp1[j]=sp2[i];
            sp2[i]=temp;
            //
            kk[k++]=MAXminusMIN(sp2);
           
            
        }
        
        
        return kk ;
    }
    static int MAXminusMIN(int[] T){
    int max= T[0];
    int min= T[0];
        for (int i = 1; i < T.length; i++) {
            if(T[i]>max) max = T[i];
            if(T[i]<min) min = T[i];
        }
    return max-min;
    
    }
    static int MIN(int[] T){
  
    int min= T[0];
        for (int i = 1; i < T.length; i++) {
          
            if(T[i]<min && T[i]!=-1) min = T[i];
        }
    return  min;
    
    }// calculate all the unfairnesses :D C(p,k)
     
  static int Combination(int k, int n){
  
  return factorial(n)/(factorial(n-k)*factorial(k));
  
  }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int K=sc.nextInt();
      
            int[] TS = new int[T];
            for (int i = 0; i < T; i++) {
                TS[i] = sc.nextInt();
                 
            }
             System.out.println(MIN(calculatMinUnfairness(K, TS)));
      
 
       }

    private static int factorial(int n) {
     if(n<=1) return 1;
     return n*factorial(n-1);
    }
}

/*
6
3
10
20
30
100
101
102

*/