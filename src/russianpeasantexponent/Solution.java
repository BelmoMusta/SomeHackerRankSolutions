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


            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            ComplexNumber c = new ComplexNumber(a,b);
            long k =sc.nextLong();
            long m = sc.nextLong();
            c=c.exponentiate(k,m);
            System.out.print(c.a+" "+c.b);
            q--;
            System.out.println();
        }


    }

    static class ComplexNumber {
        BigInteger a, b;
        public ComplexNumber(BigInteger a, BigInteger b) {
            this.a = a;
            this.b = b;
        }

        private ComplexNumber(ComplexNumber cc) {
            this.a = cc.a;
            this.b = cc.b;
        }

        public ComplexNumber exponentiate(long k, long m) {
            ComplexNumber P;
            ComplexNumber res = new ComplexNumber(this);

            while ((k & 1) == 0) {
                res = res.Multiply(res, m);
                k >>= 1;
            }
            P = new ComplexNumber(res);
            k >>= 1;
            while (k > 0) {
                res = res.Multiply(res, m);
                if ((k & 1) != 0)
                    P = P.Multiply(res, m);
                k >>= 1;
            }
            return P;


        }

        private ComplexNumber Multiply(ComplexNumber c, long m) {
            BigInteger aa = (a.multiply(c.a).subtract(b.multiply(c.b))).mod(new BigInteger("" + m));
            BigInteger bb = (a.multiply(c.b).add(b.multiply(c.a))).mod(new BigInteger("" + m));

            return new ComplexNumber(aa, bb);

        }

    }
    }
