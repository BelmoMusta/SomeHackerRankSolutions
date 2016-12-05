package algos.angryProfessor;

import java.util.Scanner;

/**
 * Created by DELL on 04/12/2016.
 */
public class Solution {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {

                int n = sc.nextInt();
                int k = sc.nextInt();

                for (int j = 0; j < n; j++) {
                    int p = sc.nextInt();
                    if(p<=0){
                        k--;
                    }
                }

                if(k>0) System.out.println("NO");
                else System.out.println("YES");





            }
        }


}