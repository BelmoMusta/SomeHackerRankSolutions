package jv.md5;






public class Solution {


    public static void main(String[] args) throws  Exception {
        java.util.Scanner sc = new java.util.Scanner(System.in);


        String str = sc.next();

        byte[] b = java.security.MessageDigest.getInstance("SHA-256").digest(str.getBytes("UTF-8"));
        java.math.BigInteger bb= new java.math.BigInteger(1,b);


        String res = bb.toString(16);



        if(res.length()<64) res="0"+res;



        System.out.println(res);



    }
}
