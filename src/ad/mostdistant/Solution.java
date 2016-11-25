/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ad.mostdistant;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Solution {
   static class Point{
    long x,y;

        public Point() {
        }

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    
    double distance(Point another){
    
    return Math.sqrt(Math.pow(x-another.x, 2)+Math.pow(y-another.y, 2));
    
    }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long xMax=0L,yMax=0L,yy=0,xx=0,xxx=0,yyy=0;
         int NN = N%2;
        for (int i = 0; i < N/2; i++) {
            long currentX=sc.nextLong();
            if(Math.abs(xMax)<Math.abs(currentX))xMax=currentX; 
            
             long currentY=sc.nextLong();
              if(Math.abs(yMax)<Math.abs(currentY))yMax=currentY; 
            xxx = sc.nextLong();
         if(Math.abs(xx)<Math.abs(xxx))xx=xxx; 
         
           yyy =sc.nextLong();
         if(Math.abs(yy)<Math.abs(yyy))yy=yyy; 
        
        
        }
        for (int i = 0; i < NN; i++) {
            xxx = sc.nextLong();
         if(Math.abs(xx)<Math.abs(xxx))xx=xxx; 
         
           yyy =sc.nextLong();
         if(Math.abs(yy)<Math.abs(yyy))yy=yyy; 
            
            
        }
        
            System.out.println(Math.abs( Math.sqrt(Math.pow(yMax,2)+Math.pow(xMax, 2))));
//             System.out.println(Math.abs(yy-yMax));
          
double mDistance = max(Math.abs(xx-xMax),      Math.abs(yy-yMax),     Math.sqrt(Math.pow(yMax,2)+Math.pow(xMax, 2)));
         
        
        
      NumberFormat formatter = new DecimalFormat("#0.000000");     
System.out.println(formatter.format(mDistance));
       
    }
    static double max(double ... N){
    if(N.length==1) return N[0];
    double temp=N[0];
        for (int i = 1; i < N.length; i++) {
            if(temp<N[i]) temp=N[i];
        }
    
    return temp;
    
    }
    
}
