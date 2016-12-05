package algos.kangoroo;

import java.util.Scanner;

/**
 * Created by DELL on 03/12/2016.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        if(x1<x2 && v1<v2){
            System.out.println("NO");
            return ;
        }
        if(x1>x2 && v1>v2){
            System.out.println("NO");
            return;
        }


        int k1=x1;
        int k2=x2;
int jumps =0;
        while (true){
        k1+=v1;
        k2+=v2;
            jumps++;
            if(k2==k1 && jumps%v1==0 && jumps%v2==0) {

                System.out.println("YES");
                break;
            }

        }


    }
}
