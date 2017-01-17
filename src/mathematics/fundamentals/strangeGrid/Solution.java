package mathematics.fundamentals.strangeGrid;

/**
 * Created by DELL on 17/01/2017.
 * <a href="https://www.hackerrank.com/challenges/strange-grid">Problem statement</a>
 */
import java.io.*;
import java.util.*;

public class Solution {
    static long strangeGrid(long r, long c){
        if((r&1)==1) return 2*(c-1)+10*(r/2);

        return 2*(c-1)+10*((r-1)/2)+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long r=sc.nextLong();
        long c=sc.nextLong();
        System.out.println(strangeGrid(r, c));
    }
}