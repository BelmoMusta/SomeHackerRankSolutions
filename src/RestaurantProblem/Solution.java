/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RestaurantProblem;
import java.util.*;
/**
 *
 * @author Belmostapha
 */
public class Solution {
    static int getSquaresFrom(int x, int y){
//        if(x==y) return 1;
        int xx = Math.max(x,y);
    int yy=0;
        for (int i = 2; i <=xx; i++) {
            if((x*y) % (i*i)==0)
                yy=(x*y)/(i*i);
        }
    
    return yy;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T= in.nextInt();
        int[] l= new int[T];
        int[] b = new int[T];
        for (int i = 0; i < T; i++) {
            l[i]= in.nextInt();
            b[i]= in.nextInt();
            
        }
          for (int i = 0; i < T; i++) {
        System.out.println(getSquaresFrom(l[i],b[i]));}
    }
    
}
 