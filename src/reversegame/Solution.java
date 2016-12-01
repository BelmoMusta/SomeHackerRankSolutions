package reversegame;

/**
 * Created by DELL on 26/11/2016.
 */

import java.util.Arrays;

/**
 * <a href="https://www.hackerrank.com/challenges/reverse-game"> Problem statement</a>
 */
public class Solution {



    static int[] reverseTable(int[] tab){
        int[] res = new int[tab.length];

        for (int i=0;i<tab.length;i++){

            res[res.length-1-i]=tab[i];
        }


        return res;
    }

    static int[] reverseTableFromPosition(int[] tab,int position){
        int length = tab.length;
        int[] res = new int[length];

        int i=0;
        while (length>0){


            res[i]=tab[(position+i)%length];

            length--;
            i++;
        }


        return res;
    }


    public static void main(String[] args) {


        int[] u = new int[3];

        u[0]=1;
        u[1]=3;
        u[2]=5;


        System.out.println(Arrays.toString(reverseTableFromPosition(u,0)));

    }
}
