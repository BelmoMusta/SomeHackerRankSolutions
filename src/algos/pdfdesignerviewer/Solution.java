//

package algos.pdfdesignerviewer;


import java.util.Arrays;
import java.util.Scanner;


/**
 * Created by DELL on 30/11/2016.
 * https://www.hackerrank.com/challenges/designer-pdf-viewer
 */
public class Solution {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        short[] alpha = new short[26];


        for (int i = 0; i < 26; i++) {

            alpha[i] = sc.nextShort();

        }

        String abc = sc.next();

        int mxHeight = alpha[abc.charAt(0) - 'a'];
        int mWidth = abc.length();


        for (int i = 1; i < abc.length(); i++) {
            if (mxHeight < alpha[abc.charAt(i) - 'a'])
                mxHeight = alpha[abc.charAt(i) - 'a'];

        }

        System.out.printf("%d\n", mxHeight * mWidth);



    }

}




