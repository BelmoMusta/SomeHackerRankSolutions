//

package algorithms.implementation.rotation;


import java.util.*;


/**
 * Created by DELL on 30/11/2016.
 * https://www.hackerrank.com/challenges/circular-array-rotation
 */
public class Solution {

    static void rotate(int [] tab) {

        int tmp = tab[tab.length-1];
        int i=tab.length-2;

        while(i>=0){
            tab[i+1]=tab[i--];

        }

tab[0]=tmp;


    }


    public static void main(String[] args) {

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










    }

}




