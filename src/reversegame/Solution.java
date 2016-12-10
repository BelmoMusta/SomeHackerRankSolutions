package reversegame;

/**
 * Created by DELL on 26/11/2016.
 */


import java.util.*;

/**
 * <a href="https://www.hackerrank.com/challenges/reverse-game"> Problem statement</a>
 */
public class Solution {


    private static LinkedList<Long> getPrimeDivisors(long n){
        LinkedList<Long> res  = new LinkedList<>();

        for (long i = 2; i <= n/2; i++) {
            if(isPrime(i) && n%i==0) res.add(i);

        }


        return res;
    }
    private static int getEvenDivisorsNumber(long n){
        if((n&1)==1) return 0;

        LinkedList<Long> primes = getPrimeDivisors(n);
        Map<Long,Integer> map = new TreeMap();
        long m=n;
        for (int i = 0; i < primes.size(); ) {
            if(m%primes.get(i)==0){
                if(map.get(primes.get(i))==null)  map.put(primes.get(i), 1);
                else  map.replace(primes.get(i), map.get(primes.get(i))+1);
                m/=primes.get(i);


            }
            else{
                i++;
            }

        }

        int s=1;
        for (Map.Entry<Long, Integer> entrySet : map.entrySet()) {
            Long key = entrySet.getKey();

                Integer value = entrySet.getValue();
            if(key==2) value--;
            s*=(value+1);

        }
        return s;
    }

    private static boolean isPrime(long p) {
        for (int j = 2; j <= Math.sqrt(p); j++) {
            if(p%j==0) return false;

        }

        return true ;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){

            long n=sc.nextLong();
            System.out.println((nbDivs(n)));

        }


    }

    static long nbDivs(long n){

        long res = 0 ;
        if((n&1)==1) return 0;

        for (int i = 2; i <=n ;) {

            if(n%i==0) res++;

                if(n%(2*i)==0) i*=2;
                else i+=2;

        }
        return res;
    }


}
