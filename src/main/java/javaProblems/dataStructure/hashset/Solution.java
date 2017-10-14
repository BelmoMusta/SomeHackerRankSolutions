package javaProblems.dataStructure.hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href="https://www.hackerrank.com/challenges/java-hashset">Problem statement</a>
 */

public class Solution {
    
    
    
    public static void main(String[] args) {
        Set<String> set  = new HashSet();
    Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      sc.nextLine();
        for (int i = 0; i < t; i++) {
            String line = sc.nextLine();
            set.add(line);
            System.out.println(set.size());
        }
        
        
        
        
        
    }
    
}
