/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaProblems.dataStructure.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 * <a href="https://www.hackerrank.com/challenges/java-arraylist">Problem statement</a>
 */
public class Solution {
    
    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<ArrayList<Integer>> data = new ArrayList();
            
            int testCases= sc.nextInt();
            sc.nextLine();
            
            for (int i = 0; i < testCases; i++) {
                ArrayList<Integer> temp = new ArrayList();
            Scanner scc = new Scanner(sc.nextLine());
         if(scc.hasNext())   scc.next();
            while(scc.hasNext()) temp.add(scc.nextInt());
            data.add(temp);
            
        }
          //  sc.nextLine();
            int d= sc.nextInt();
      for(int i =0 ;i<d;i++){
      int x= sc.nextInt();
      int y = sc.nextInt();
      
      
  
              
      
          try {
              System.out.println(data.get(x-1).get(y-1));
          } catch (Exception e) {
              System.out.println("ERROR!");
          }
          
      
      
      }
      //  System.out.println(data);
        
      
    }
    
}
