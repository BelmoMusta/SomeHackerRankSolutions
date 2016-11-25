/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv.genereicity;

import java.lang.reflect.Method;

class Printer
{
  public <T> void  printArray(T[] ar){
  
      for (T a : ar) {
          System.out.println(a);
          
      }
  
  
  }
 
}

public class Solution
{
    

    public static void main( String args[] )
    {
        Printer myPrinter=new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello","World"};
        myPrinter.printArray( intArray  );
        myPrinter.printArray( stringArray );
        int count=0;
      for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if(name.equals("printArray"))
              count++;
        }
        
        if(count>1)System.out.println("Method overloading is not allowed!");
        assert count==1;

    } 
}
