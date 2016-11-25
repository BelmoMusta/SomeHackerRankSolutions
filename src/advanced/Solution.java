/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.in;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author DELL
 */
public class Solution {

	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

   
	
}

     class Prime {

        public Prime() {
        }
        
        void checkPrime(int... n){
            if(n.length==0) return;
            for (int o=0;o<n.length-1;o++) {
                
                if(!isPrime(n[o])) System.out.print("");
                else
                     
                    System.out.print(n[o]+" ");
                
            }
            int oo=n.length-1;
            if(!isPrime(n[oo])) System.out.print("");
                else
                     
                    System.out.print(n[oo]);
        
            System.out.println("");
        }
        
        boolean isPrime(int o){
            if(o==1) return false;
            if(o==2) return true;
            
            for (int i = 2; i < o; i++) {
                if(o%i==0) return false;
            }
        
        
        return true;
        }
    }