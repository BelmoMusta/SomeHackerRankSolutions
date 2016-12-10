package math.algebra.shashankandlist;

import java.util.*;

/**
 * Created by DELL on 07/12/2016.
 */
public class Solution {




    static void solve(Scanner sc)
    {
        int n = sc.nextInt();

        long ret = 1;
        int mod = 1000000007;
        for(int i = 0;i < n;i++){
            long m = sc.nextLong();
            long e = pow(2, m, mod) + 1;
            ret = ret * e % mod;
        }
        System.out.println((ret+mod-1)%mod);
    }

    public static long pow(long a, long n, long mod)
    {

        long ret = 1;
        int x = 63-Long.numberOfLeadingZeros(n);
        for(;x >= 0;x--){
            ret = ret * ret % mod;
            if(n<<63-x<0)ret = ret * a % mod;
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        solve(sc);
    }
}
