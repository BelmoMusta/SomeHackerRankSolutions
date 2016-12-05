package algos.applesandoranges;

import java.util.Scanner;

/**
 * Created by DELL on 03/12/2016.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();

        int apple = 0;

        for(int apple_i=0; apple_i < m; apple_i++){
            int ap =in.nextInt();
            if(a+ap>=s && a+ap<=t)
            apple ++;
        }

        int orange =0;
        for(int orange_i=0; orange_i < n; orange_i++){
            int or =in.nextInt();
            if(b+or>=s && b+or<=t)

                orange ++;

        }

        System.out.printf("%d\n%d ",apple,orange);
    }
}
