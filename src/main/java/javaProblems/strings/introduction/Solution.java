/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaProblems.strings.introduction;

import java.util.Scanner;

/**
 *
 * @author DELL
 * <a href="https://www.hackerrank.com/challenges/java-strings-introduction">Problem statement</a>
 */
public class Solution {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next();
        String B = sc.next();
        
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)>0) System.out.println("Yes");
        else System.out.println("No");
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1)+" "
                +B.substring(0, 1).toUpperCase() + B.substring(1));

    }
}
