/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatype;

import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class Solution {
    // byte<short<int<long
    
  static boolean[] fitAnumberTo(String s){
    boolean[] dataTypes= new boolean[4];
        try {
        Byte.parseByte(s);
            
            dataTypes[0]=true;
        } catch (Exception e) {
            
        }
        
        try {
            Short.parseShort(s);
            dataTypes[1]=true;
        } catch (Exception e) {
            
        }
        
        
        try {
            Integer.parseInt(s);
            dataTypes[2]=true;
        } catch (Exception e) {
            
        }
        
        try {
            Long.parseLong(s);
            dataTypes[3]=true;
        } catch (Exception e) {
            
        }
    
    
    
    
    
    
    
    
    
    return dataTypes;
    }
  
  static void showDataTypes(String s){
  boolean b[] = fitAnumberTo(s);
  String[] types = {"byte","short","int","long"};
  int y=0;
  String out= s+" can be fitted in:\n";
  boolean thersIs=false;
      for (boolean dataType : b) {
          if(dataType) {
          thersIs=true;
          out+="* "+types[y]+"\n";
          }
          y++;
      }
      if(!thersIs){
      
          out=(s+" can't be fitted anywhere.");
      
      }
        System.out.print(out);
  
  }
    
    public static void main(String[] args) {
        showDataTypes("-150");
        
    }
}
