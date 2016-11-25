/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv.collections;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Solution {
    static  ArrayList<Integer>  spotNegativeValues(int ... A){
         
        ArrayList<Integer> array = new ArrayList();
        for (int i = 0; i < A.length; i++) {
            if(A[i]<0) array.add(i);
        }
    return array;
    }
    static int numOfNegativeArrays(int ... A){
    ArrayList<Integer> index = spotNegativeValues(A);
    
    int count=0;
    
        for (Integer idx : index) {
            int sum=idx;
            int ends=0;
            for (int i = idx; i >= 0; i--) {
                sum+=A[i];
                if(sum>0){
                    ends=i;
                    break;
                }
            
            }
            
             
                 
            for (int i = A.length-1; i > idx; i--) {
                sum+=A[i];
            }
            
        }
    
    
    
    return count;
    }
    
    
    public static void main(String[] args) {
        int[] array = {1 ,-2 ,4 ,-5 ,1};
        System.out.println(numOfNegativeArrays(array));
    }
}
