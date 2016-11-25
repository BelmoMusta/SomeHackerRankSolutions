/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindromeindex;

import java.util.Scanner;

/**
 *
 * @author Belmostapha
 */
public class Solution {
     static boolean isPalindrom(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

        }
        return true;
    }
     static int indexToReplace(String s){
     if(isPalindrom(s))
  return -1; 
     int ix=-1;
         for (int i = 0; i < s.length(); i++) {
             String h="";
             for (int j = 0; j < s.length(); j++) {
                 if(j!=i)
                     h+=s.charAt(j);
             }
             if(isPalindrom(h)) return i;
         }
     return ix;
     }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (T < 0 || T > 1000) {
            System.err.println("ERROR");
        } else {
            String[] TS = new String[T];
            for (int i = 0; i < T; i++) {
                TS[i] = sc.next();
            }
            for (int i = 0; i < T; i++) {
                System.out.println(indexToReplace(TS[i]));

            }
        }
    }
}
