/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package please;

import java.util.*;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static BigInteger  fuck(String n,  String m){
        
        BigInteger mm= new BigInteger(""+m);
                BigInteger nn= new BigInteger(""+n);
                

        BigInteger ten = new BigInteger("10");
    BigInteger nine  = new BigInteger("9");
        BigInteger temp  = new BigInteger("100000000000000000");

    BigInteger x= (((ten.modPow(nn,temp).subtract(BigInteger.ONE)).divide(nine)).subtract(mm)).mod(mm);
            //(long) ((Math.pow(10, n)-1)/9-m);
    
    return x;
    }
    static int sumOfDigits(String str){
    int s=0;
        for (int i = 0; i < str.length(); i++) {
            s+=(str.charAt(i)-'0');
            
        }
    
    
    return s;
    }
    static boolean isStrange(long n){
    if(n<10) return true;
    
    int numDigits= (int) Math.ceil(Math.log(n));
    if(n%numDigits==0) return true;
    return isStrange(n/numDigits);
    
    
    
    
    
    }
    static ArrayList<String> generateThem(long n){
        ArrayList<String> res = new ArrayList();
        Pattern p =   Pattern.compile("(10+)+1?");
        for (int i = 0; i < n; i++) {
            String s=Long.toBinaryString(i);
            Matcher m = p.matcher(s);
            if(m.matches()) res.add(s);
        }
    
    
    return res;
    }

    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//int t= sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            
//            System.out.println(fuck(sc.next(),sc.next()));
//            
//        }
//        
//        
        System.out.println(1^4^2);
        System.out.println(generateThem(20));
    }
}