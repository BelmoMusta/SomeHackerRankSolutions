/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xor;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 

/**
 *
 * @author DELL
 */
public class Solution {
    
    static Map<Integer,Long> xors  = new LinkedHashMap<>();
    
    
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
    
    
    static void fillMap(int n){
        
    Pattern p =   Pattern.compile("(10+)+1?");
    int k=1;
    xors.put(0,1L);
        for (long i = 1; k <=n; i++) {
            String s=Long.toBinaryString(i);
            Matcher m = p.matcher(s);
            if(m.matches()) {
                xors.put(k++,i);
                        }
        }
    
    
    
    }
    
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int max=-1;

       int [] a = new int [n];
 long s=0;
        for (int i = 0; i < n; i++) {
            int y =sc.nextInt();
            if(y>max) max=y;
           a[i]=y; 
        }
        
        fillMap(max);
        for (int i = 0; i < a.length; i++) {
           s^=xors.get(a[i]);
            
        }
           System.out.println(s);
        
        
        
        
     
        
    }
        
    
}
