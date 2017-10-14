/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaProblems.strings.anagrams;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL
 * <a href="https://www.hackerrank.com/challenges/java-anagrams">Problem statement</a>
 */
public class Solution {
    
     private static String anagrams(String A, String B) {
        char[] As =A.toCharArray();
        char[] Bs =B.toCharArray();
        Arrays.sort(As);
        Arrays.sort(Bs);
        if(Bs.length!=As.length) return "Not Anagrams";
        
         for (int i = 0; i < As.length; i++) {
             if(As[i]!=Bs[i]) return "Not Anagrams";
             
         }
return "Anagrams";
    }
    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);
        
        String A = sc.next().toLowerCase();
        String B = sc.next().toLowerCase();
        System.out.println(anagrams(A,B));
    }

   
}
