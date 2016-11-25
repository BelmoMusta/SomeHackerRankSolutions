package Palindromes;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author Belmostapha
 */
public class Solutions {

   private static boolean isPalindrom(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

        }
        return true;
    }
    

}
/***
 * Problem Statement

Shaka and his brother have created a boring game which is played like this:

They take a word composed of lowercase English letters and try 
* to get the maximum possible score by building exactly 2 palindromic 
* subsequences. The score obtained is the product of these 2 subsequences.

Let's say A and B are two subsequences from the initial string. 
* If Ai & Aj are the smallest and the largest positions 
* (from the initial word) respectively in A ; and Bi & Bj 
* are the smallest and the largest positions (from the initial word) 
* respectively in B, then the following statements hold true: 
* Ai≤Aj, Bi≤Bj, & Aj<Bi. i.e., the positions of the subsequences should not cross over each other.

Hence the score obtained is the product of lengths of subsequences A & B. 
Such subsequences can be numerous for a larger initial word, and hence it 
* becomes harder to find out the maximum possible score. Can you help Shaka and his brother find this out?

Input Format Input contains a word S composed of lowercase 
* English letters in a single line.

Output Format Output the maximum score the boys can get from S.

Constraints 1<|S|≤3000 each character will be a lower case english alphabet.
 */