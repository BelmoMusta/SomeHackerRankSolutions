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






    static void rotate(int [] tab) {

        int tmp = tab[tab.length-1];
        for (int i = tab.length-2;i>=0 ; i--) {
            tab[i+1]=tab[i];

        }
tab[0]=tmp;


    }


    public static void main(String[] args) {
/*
        Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int k= sc.nextInt()%n;
int q= sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i <n; i++) {
            a[i] =sc.nextInt();
        }

        while(k>0){
        rotate(a);

        k--;
        }

        while(q>0){
            System.out.println(a[sc.nextInt()]);
            q--;
        }

        System.out.println(Arrays.toString(a));


        int[] o = {1,2,3,4};

        for (int i = 0; i < 2*o.length; i++) {
            rotate(o);
        }

        rotate(o);



        System.out.println(Arrays.toString(o));
        */

    }

}




