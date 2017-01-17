package javaProblems.orientedObject.interfaces;

import java.util.Scanner;

/**
 * Created by DELL on 17/01/2017.
 * 
 * <a href="https://www.hackerrank.com/challenges/java-interface">Problem statement</a>
 */
public class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
interface AdvancedArithmetic{
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{

    @Override
    public  int divisor_sum(int n){
        int sum=n;

        for(int y=1;y<=n/2;y++){

            if((n%y)==0) sum+=y;

        }

        return sum;

    }
}
