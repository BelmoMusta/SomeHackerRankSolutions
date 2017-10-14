/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaProblems.dataStructure.maps;

/**
 *
 * @author DELL
 * <a href="https://www.hackerrank.com/challenges/phone-book">Problem statement</a>
 */
 import java.util.*;

class Solution{
   public static void main(String []argh){
       Map<String,Integer> entries =  new LinkedHashMap();
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      for(int i=0;i<n;i++){
          
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
         entries.put(name, phone);
         
      }
      while(in.hasNext()){
         String s=in.nextLine();
         if(entries.get(s)!=null)
              System.out.println(s+"="+entries.get(s));
         else System.out.println("Not found");
      }
   }
}