/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainitialiserblock;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Solution {
    static boolean flag;
    static int B,H;
    static{
    Scanner sc = new Scanner(System.in);
    B=sc.nextInt();
    H=sc.nextInt();
    
    flag=B>0 && H>0;
    
    if(!flag) try {
        throw new Exception("Breadth and height must be positive");
    } catch (Exception ex) {
        System.out.println(ex);
        
    }

    
    
    }
    
    
    
    
    
    public static void main(String[] args) {
       if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

        
        
    }
