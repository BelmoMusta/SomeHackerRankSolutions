package javaProblems.bigNumber.bigdecimal;
/**
 * <a href="https://www.hackerrank.com/challenges/java-bigdecimal">Problem statement</a>
 */
import java.math.BigDecimal;
import java.util.*;
public class Solution{

    public static void main(String []argh)
    {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }

        //Write your code here
      
       Arrays.sort(s, new Comparator<String>(){

            @Override
            public int compare(String a, String b) {
               BigDecimal aa  = new BigDecimal(a);
                             BigDecimal bb  = new BigDecimal(b);
                             
                             return aa.compareTo(bb);
 
            }
       
       
       
       });
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }


}
