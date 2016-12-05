//

package algos.lisaworkbook;


import java.util.*;

/**
 * Created by DELL on 30/11/2016.
 * https://www.hackerrank.com/challenges/lisa-workbook
 */
public class Solution {




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int k= sc.nextInt();

         int[] t = new int[n];

int s=0;

        for (int i = 0; i < n; i++) {
                  t[i]=sc.nextInt();
            s+=t[i];


        }

int [] tb =new int[s];

int counter=0;
        for (int i = 0; i < n;i++ ) {

            for (int j = 0; j <t[i] ; j++) {
                tb[counter++]=j+1;
            }


        }

int m=0;
        for (int i = 0; i < counter; i++) {

            if(i+1==tb[i]) m++;// System.out.printf("%d\n",i+1);

        }


        //System.out.printf("%d",m);
        System.out.println(Arrays.toString(tb));
    }

}




