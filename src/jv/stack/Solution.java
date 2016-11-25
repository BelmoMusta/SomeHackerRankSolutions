/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv.stack;

import java.util.*;
 

public class Solution
{
  Scanner in = new Scanner(System.in);
 static  Stack<Integer> stack;



  public static boolean check(String input)  {
      stack = new Stack<Integer>();
    
      
      
     
    
    for (int i = 0; i < input.length(); i++)
    { 


      char ch = input.charAt(i);
      if (ch == '(' || ch == '[' || ch == '{')
        stack.push(i);
      else if (ch == ')'|| ch == ']' || ch == '}')
      {
        
     
if(stack.isEmpty())  return false;       stack.pop();
      }  
      
      else stack.push(i);
    }
      return stack.isEmpty();
  }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
          System.out.println(check(sc.next()));
      }
    }
      


}