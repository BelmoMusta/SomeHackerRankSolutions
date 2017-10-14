/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathematics.fundamentals.nchoosek;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Solution {
    
     
        private static long binomial(long n, long k)
    {
        if (k>n-k)
            k=n-k;  
 
        long b=1;
        for (long i=1, m=n; i<=k; i++, m--)
            b=b*m/i;
        return b;
    }
 
    
    public static void main(String[] args) {
        
        
        
        
        Scanner sc = new Scanner(System.in);
        
        
        int testCase = sc. nextInt();
        
        for (int i = 0; i < testCase; i++) {
            
             int n = sc.nextInt();
             
             long[] ncrs= new long[n+1];
             
             StringBuilder sb = new StringBuilder();
                          StringBuilder sbb = new StringBuilder(); 

             
             for(int ii=0;ii<=n/2;ii++){
                 
                 sb.append(binomial(n,ii)).append(" ");
       
       //ncrs[ii]=binomial(n, ii);
       
       
       sbb.insert(0,binomial(n,ii)+" ");//.append(" ");
              //ncrs[n-ii]=binomial(n, ii);

       }
       
      
           
             //sbb=sbb.reverse();
             
             System.out.println(sb.append(sbb));
        }
        
        
      
        
        
        
         
        
        
        
    }
    
}
