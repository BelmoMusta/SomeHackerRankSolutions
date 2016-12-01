package russianpeasantexponent;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by DELL on 26/11/2016.
 */
public class Solution {


    public static void main(String[] args)  {





//
        Scanner sc = new Scanner(in);
        long q = sc.nextLong();

        while(q>0){


            long a = sc.nextLong();
            long b = sc.nextLong();

            ComplexNumber c = new ComplexNumber(a,b);
            long k =sc.nextLong();
            long m = sc.nextLong();
            c=c.exponentiate(k,m);
            System.out.print(c.a+" "+c.b);
            q--;
            System.out.println();
        }


    }


    }
