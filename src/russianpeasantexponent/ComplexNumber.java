package russianpeasantexponent;

import java.math.BigInteger;

/**
 * Created by DELL on 26/11/2016.
 */
public class ComplexNumber {
    long a, b;
    public ComplexNumber(long a, long b) {
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
long aa  = ((a*c.a)-(b*c.b))%m;
long bb  = ((a*c.b)+(b*c.a))%m;


        return new ComplexNumber(aa, bb);

    }

}
