package algos.utopiantree;

import java.util.Scanner;

/**
 * Created by DELL on 04/12/2016.
 * https://www.hackerrank.com/challenges/utopian-tree
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int h=1;
            int n = in.nextInt();

            for (int i = 0; i < n; i++) {
                if((i&1)==0)h*=2;
                else h+=1;
            }

            System.out.printf("%d\n",h);

        }
        }
}
