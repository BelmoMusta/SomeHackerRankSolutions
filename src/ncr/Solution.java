/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncr;

import java.math.BigInteger;

 

/**
 *
 * @author DELL
 */
public class Solution {
    
    
    private static long binomial(int n, int k)
    {
        if (k>n-k)
            k=n-k;
 
        long b=1;
        for (int i=1, m=n; i<=k; i++, m--)
            b=b*m/i;
        return b;
    }
    
    private static BigInteger binomial(String n, String k){
        BigInteger nn  = new BigInteger(n);
                BigInteger kk  = new BigInteger(k);
                
                if(kk.compareTo(nn.subtract(kk))>0) kk= nn.subtract(kk);
 
 
        long b=1;
        BigInteger bb =  BigInteger.ONE;

        for (BigInteger ii=BigInteger.ONE, m=nn; ii.compareTo(kk)<=0; ii=ii.subtract(new BigInteger("-1")), m=m.subtract(new BigInteger("-1")))
            
            bb=bb.multiply(m).divide(ii);
            
        return bb;
    }
     public static void main(String[] args){
         double r= 34.425353;
         int n= (int) (r*100);
         
         r=n/100.0;
         
         System.out.println(r);
        }
 
         
    
     
    
}
