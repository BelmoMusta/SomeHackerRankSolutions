package algos.betweentwosets;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by DELL on 04/12/2016.
 */
public class Solution {

    static boolean muliple(int d, int ... y){

        for (int i = 0; i < y.length; i++) {
            if(y[i]%d!=0) return false;
        }
return true;
    }
    static boolean divisor(int d, int ... y){

        for (int i = 0; i < y.length; i++) {
            if(d%y[i]!=0) return false;
        }
return true;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];

        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }

        int[] aa= new int[n];
        int[] bb= new int[m];








        System.out.println(Arrays.toString(aa));
        System.out.println(Arrays.toString(bb));
    }
}
