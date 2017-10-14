/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaProblems.bigNumber.bignumbers;

import static java.lang.System.in;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author DELL
 * <a href="https://www.hackerrank.com/challenges/java-biginteger">Problem statement</a>
 */
public class Solution {
    
    
    
    
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    BigInteger a  =  new BigInteger(sc.next());
        BigInteger b  =  new BigInteger(sc.next());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        
        

    
    
    }
    
}
