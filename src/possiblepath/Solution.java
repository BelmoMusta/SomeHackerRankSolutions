/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package possiblepath;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Solution {
    
    
 
    
    /*** taken from <a>https://rosettacode.org/wiki/Greatest_common_divisor#Java* </a>/
     * 
     * @param u
     * @param v
     * @return 
     */
    
    
    public static long gcd(long u, long v){
  long t, k;
 
  if (v == 0) return u;
 
  u = Math.abs(u);
  v = Math.abs(v); 
  if (u < v){
    t = u;
    u = v;
    v = t;
  }
 
  for(k = 1; (u & 1) == 0 && (v & 1) == 0; k <<= 1){
    u >>= 1; v >>= 1;
  }
 
  t = (u & 1) != 0 ? -v : u;
  while (t != 0){
    while ((t & 1) == 0) t >>= 1;
 
    if (t > 0)
      u = t;
    else
      v = -t;
 
    t = u - v;
  }
  return u * k;
}
    
    
    public static boolean possible(long a, long b , long x , long y){
    
    long d= gcd(a,b);
    
    if(d==1) return false;
    return    y%d==0 && x%d==0;
    
    }
    
    
    
    
    static void possible(int a , int b  , int x, int y){
    
    int xx, yy, aa , bb; 
    
    if(x>a)
    { xx= x/a; System.out.println("x= "+xx+" . "+a +"+"+ (x%a));}
    
    else 
        
        { xx= a/x; System.out.println("a= "+xx+" . "+x +"+"+ (a%x));}
     if(x>b)
    { xx= x/b; System.out.println("x= "+xx+" . "+b +"+"+ (x%b));}
     
      else 
        
        { xx= b/x; System.out.println("b= "+xx+" . "+x +"+"+ (b%x));}
     if(y>a)
     
    { yy= y/a; System.out.println("y= "+yy+" . "+a + "+"+(y%a));} 
     
     
      else 
        
        { yy= a/y; System.out.println("a= "+yy+" . "+a +"+"+ (a%y));}
    if(y>b)
    { yy= y/b; System.out.println("y= "+yy+" . "+b +"+"+ (y%b));} 
    else 
        
        { yy= b/y; System.out.println("b= "+yy+" . "+b +"+"+ (b%y));}
    
    
    }
    
    public static void main(String[] args) {
        /*
       
        Scanner sc = new Scanner(System.in);
        
        
        int testCases  = sc.nextInt();
        
        
        for (int i = 0; i < testCases; i++) {
            
            
            long a=sc.nextLong();
                        long b=sc.nextLong();
            long x=sc.nextLong();
            long y =sc.nextLong();
            
            
            System.out.println(possible(a, b, x, y)?"YES":"NO");

            
            
        }
*/
        
        
        
        //System.out.println(gcd(7913 ,5387));
        possible(7913 ,5387 ,3397 ,8880);
    }
}
