/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaloops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Solution {
     
    
    static String show(int a, int b, int n){
            ArrayList<Integer> res = new ArrayList();
    String un= "11111111111111111111111111";
    
        for (int i = 0; i <= n-1; i++) {
            res.add(a+  (Integer.parseInt(un.substring(0, i+1), 2))*b);
            
        }
    return res.toString().replace(",", "").replace("[", "").replace("]", "");
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(show(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        }
        
        
    }
}
