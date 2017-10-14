/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaProblems.strings.minmaxsubstring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Solution {
    
    static void minSubstring(String str, int k){
        char min =str.charAt(0);
     List<Integer> idx=new ArrayList();
          List<String> mins=new ArrayList();

     
        for (int i = 1; i < str.length(); i++) {
            if(min>str.charAt(i)){ min=str.charAt(i);  
        }
        
        }
        
        for (int i = 0; i < str.length(); i++) {
            
            if(min==str.charAt(i))    
                idx.add(i);
            }
        for (Integer id : idx) {
            if(id+k<=str.length()){
          mins.add(  str.substring(id,id+k));
            }
            
        }
        mins.sort((s,v)->s.compareTo(v));
     //   String temp=str.substring(str.indexOf(""+min),str.indexOf(""+min)+k);
        if(mins.size()==0) System.out.println(str);  
else
        System.out.println(mins.get(0));
    
    }
    
    static void maxSubstring(String str, int k){
        char max =str.charAt(0);
     List<Integer> idx=new ArrayList();
          List<String> maxs=new ArrayList();

     
        for (int i = 1; i < str.length(); i++) {
            if(max<str.charAt(i)){ max=str.charAt(i);  
        }
        
        }
        
        for (int i = 0; i < str.length(); i++) {
            
            if(max==str.charAt(i))    
                idx.add(i);
            }
        for (Integer id : idx) {
            if(id+k<=str.length()){
          maxs.add(  str.substring(id,id+k));
            }
            
        }
        maxs.sort((v,s)->s.compareTo(v));
     //   String temp=str.substring(str.indexOf(""+min),str.indexOf(""+min)+k);
if(maxs.size()==0) System.out.println(str);  
else
    System.out.println(maxs.get(0));
    
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        minSubstring(str, k);
        maxSubstring(str, k);
        
    }
            
    
}
/*
ASDFHDSFHsdlfhsdlfLDFHSDLFHsdl
sdlkfhsdlfhsLFDLSFHSDLFHsdkfhs

ASDFHDSFHsdlfhsdlfLDFHSDLFHsdl
sLFDLSFHSDLFHsdkfhsdkfhsdkfhsd


*/