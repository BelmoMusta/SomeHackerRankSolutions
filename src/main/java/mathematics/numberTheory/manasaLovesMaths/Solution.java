package mathematics.numberTheory.manasaLovesMaths;

/**
 * Created by DELL on 17/01/2017.
 * <a href="https://www.hackerrank.com/challenges/manasa-loves-maths">Problem statement</a>
 */
import java.io.*;
import java.util.*;

public class Solution {
    public static String yesOrNot(String t){

        int[] c=new int[t.length()];
        for(int i=0;i<t.length();i++){
            c[i]=(int)t.charAt(i)-48 ;

        }
        if(t.length()>2){
            for (int i = 0; i < c.length; i++) {
                for (int j = i+1; j < c.length; j++) {
                    for (int k = j+1; k < c.length; k++) {
                        if ((c[i]*100+c[j]*10+c[k])%8==0){return  "YES";}
                        else{
                            if((c[i]*100+c[k]*10+c[j])%8==0){return  "YES";}
                            else{
                                if((c[j]*100+c[i]*10+c[k])%8==0){return  "YES";}
                                else{
                                    if ((c[j]*100+c[k]*10+c[i])%8==0){return  "YES";}
                                    else{
                                        if((c[k]*100+c[j]*10+c[i])%8==0){return  "YES";}
                                        else{
                                            if((c[k]*100+c[i]*10+c[j])%8==0){return  "YES";}



                                        }
                                    }
                                }

                            }
                        }

                    }
                }
            }
            return "NO";
        }
        else if(t.length()==2){
            if((c[0]*10+c[1])%8==0 || (c[1]*10+c[0])%8==0) return  "YES";
            else return "NO";
        }
        else if(c[0]%8==0)  return "YES";
        else return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {

            System.out.println(yesOrNot(sc.next()));

        }
    }
}