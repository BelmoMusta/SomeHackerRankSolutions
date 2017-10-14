package javaProblems.strings.regex;


import java.util.Scanner;
/**
 *
 * @author DELL
 * <a href="https://www.hackerrank.com/challenges/java-regex/problem">Problem statement</a>
 */
class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    String pattern;
    MyRegex(){
       this.pattern= "^((([0-1]?[0-9]{1,2})|(2[0-4][0-9])|(25[0-5]))\\.){3}(([0-1]?[0-9]{1,2})|(2[0-4][0-9])|(25[0-5]))";
    }
}