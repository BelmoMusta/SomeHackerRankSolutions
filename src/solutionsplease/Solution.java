/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solutionsplease;

import java.math.BigInteger;
import java.util.*;
 
 

/**
 *
 * @author DELL
 */
public class Solution {
    static ArrayList<Long> primes = new ArrayList();
    
    static void fillPrimes(){
        for (long  i = 1; i < 1000000000L; i++) {
            
            
        }
    }
    
    private static int  divisors(long n) {
        if((n&1)==1) return 0;
        int count =2;
        int i=1;
        while(n!=0){
            if(n/(2*i++)!=0)
         if(n%(n/(2*i))==0)
         {
             n=n/(2*i);
         
         count+=1;}
         
         }
        return count-1;
    }
    
    
    public static long sumNseries(long n){
    // Sn= sum(n^2-(n^2-1) = n^2
        
        long nn=n%1000000007;
        long nnn =n%1000000007;
        
        return (nn*nnn)%1000000007;
    
    }
    
    static long getCandies(long n){
      
    long y=1;
    long count =0;
       long s=0;
    while((s+=(y*y))<=n){
    y++;
    count++;
    }
    return   count ;
    }
    static BigInteger factorial(int n){
    
                BigInteger fact =  new BigInteger("1");

        for (long i = 1; i <=n; i++) {
           fact=
                   fact.multiply(new BigInteger(""+i));
        }
    
    
    return fact;
    }
    static BigInteger powers(String  a, String b){
         BigInteger modulo  = new BigInteger("1000000007");
   
        BigInteger aa  = new BigInteger(a).mod(modulo);
        BigInteger bb  = new BigInteger(b).mod(modulo);
       BigInteger two = new BigInteger("2");
        BigInteger temp  = new BigInteger(b).mod(modulo);
        if(temp.mod(two).intValue()==0){
            temp=temp.divide(two);
            
            return aa.modPow(temp, modulo).modPow(two, modulo);
            
        }
    
    
    
    /***
     * 
     */
   
    
    return aa.modPow(bb, modulo);
    
    }
    
     
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            
           System.out.println(powers(sc.next(),sc.next()));
            
        }
              
 
    }

    
    
}
