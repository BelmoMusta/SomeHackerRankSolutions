//

package algos.rotation;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by DELL on 30/11/2016.
 * https://www.hackerrank.com/challenges/circular-array-rotation
 */
public class Solution {



    static int[] rotateBis(int [] tab) {

        int[] out = new int[tab.length];

        out[0] = tab[tab.length-1];
        for (int i = 0; i <tab.length-1 ; i++) {
            out[i+1]=tab[i];

        }

return out;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int k= sc.nextInt();
int q= sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i <n; i++) {
            a[i] =sc.nextInt();
        }

        while(k>0){
        a=rotateBis(a);

        k--;}

        while(q>0){
            System.out.println(a[sc.nextInt()]);
            q--;
        }

        System.out.println(Arrays.toString(a));


    }
}


