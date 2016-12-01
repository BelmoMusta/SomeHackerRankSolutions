
package cipher;

 
import java.util.*;

/**
 *
 * @author Belmostapha
 */
public class Solution {
    static final boolean  CIPHER=true,DECIPHER=false;
  
    private static char[][] CreatColumn(String secret){

      LinkedList<Character> ts = new LinkedList<>();
       for (int i = 0; i < secret.length(); i++) {
         if(!ts.contains(secret.charAt(i))) ts.add(secret.charAt(i));
            
        }
       secret="";
       for (Character c  : ts) {
           secret+=c;
       }
    LinkedList<Character> alpha = new LinkedList();
        for (char i = 'A'; i <= 'Z'; i++) {
            alpha.add(i);
        }
        for (int i = 0; i < secret.length(); i++) {
          alpha.remove(new Character(secret.charAt(i))); 
        }
       char[] []res = new char[secret.length()] [alpha.size()/secret.length()+2];//
       int h=0;
       for (int i = 0; i < res.length; i++) {
            res[i][0]=secret.charAt(i);}
        for (int i = 1; i < alpha.size()/secret.length()+2; i++) {
            for (int j = 0; j < res.length && h<alpha.size(); j++) {
                 res[j][i]=alpha.get(h++);   
            }
       }
    
    return res;
    }
    private static char [] newAlpha(String s){
       char[] na ;
     String result="";
   char[] [] ss= CreatColumn(s);
   TreeSet<String> tss= new TreeSet();
       for (int i = 0; i < ss.length; i++) {
           String k="";
           for (int j = 0; j < ss[i].length; j++) {
               k+=ss[i][j];
           }
           tss.add(k);
       }
       for (String st : tss) {
           result+=st;
       }
   result=result.replaceAll(" ", "");
     na=result.toCharArray();
   return na;
   }
    private static String decipher(String cipher,String secret){
   return Transform(cipher, secret, DECIPHER);
   }
    private static String cipher(String cipher,String secret){
   return Transform(cipher, secret, CIPHER);
   }
   private static String Transform(String txt ,String key,boolean type){
     String decipherd ="";
   char[] M = newAlpha(key);
   Map<Character,Character> m = new HashMap();
   for (char i = 0; i <= 127; i++) {
            m.put(i, i);
        }
   
   for (char i = 'A'; i <= 'Z'; i++) {
        if(type==CIPHER)    m.replace(i, M[i-'A']);
        else  m.replace(M[i-'A'], i);
        }
       for (int i = 0; i < txt.length(); i++) {
          decipherd+=m.get(txt.charAt(i)); 
       }
   
   return decipherd;
   }
   
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        String[][]TS = new String[T][2];
        
        for (int i = 0; i < T; i++) {
            TS[i][0]=in.next();
            in.nextLine();
            TS[i][1]=in.nextLine();
            
        }
        for (int i = 0; i < T; i++) {
        
            System.out.println(decipher(TS[i][1], TS[i][0]));
            
        }
        
    }
}
/*

Problem Statement

A keyword transposition cipher is a method of choosing a monoalphabetic substitution with which to encode a message. The substitution alphabet is determined by choosing a keyword, arranging the remaining letters of the alphabet in columns below the letters of the keyword, and then reading back the columns in the alphabetical order of the letters of the keyword.

For instance, if one chose the keyword SECRET, the columns generated would look like the following diagram. Note how the letters in the keyword are skipped when laying out the columns, and duplicate letters are removed from the keyword:

SECRT
ABDFG
HIJKL
MNOPQ
UVWXY
Z
Since the alphabetical order of the characters in the keyword is CERST, the columns are then read back in that order to get the substitution alphabet.

Original: ABCDE FGHIJ KLMNO PQRSTU VWXYZ
Substitution: CDJOW EBINV RFKPX SAHMUZ TGLQY
Task

Given a piece of ciphertext and the keyword used to encipher it with the keyword transposition cipher described above, write an algorithm to output the original message.

Input Format

The first line of input will be an integer N(1≤N≤10) indicating the number of test cases that will follow. For each test case in N, two additional lines will follow, one containing the keyword, and one containing the ciphertext. The keyword will be at most 7 characters long, and the ciphertext will be at most 255 characters in length.

Output Format

Your output should be the decoded version of the cipher text for each test case, one per line.

Sample Input

2
SPORT
LDXTW KXDTL NBSFX BFOII LNBHG ODDWN BWK
SECRET
JHQSU XFXBQ
Sample Output

ILOVE SOLVI NGPRO GRAMM INGCH ALLEN GES
CRYPT OLOGY
*/