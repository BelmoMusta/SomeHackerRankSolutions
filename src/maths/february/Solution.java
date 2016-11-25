/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths.february;

/**
 *
 * @author DELL
 */
public class Solution {
    
    static boolean isAperfeectSquare(long n){
    
    double square = Math.sqrt(n);
    return Math.floor(square)==square ;
    
    }
    
    public static void main(String[] args) {
        System.out.println(isAperfeectSquare(9));
    }
}
