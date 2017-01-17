package javaProblems.advanced.singletion;

/**
 * Created by DELL on 17/01/2017.
 * <a href="https://www.hackerrank.com/challenges/java-singleton">Problem statement</a>
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    static Singleton instance = new Singleton();
    public String str;

    private Singleton(){}

    public static Singleton  getSingleInstance(){
        return instance;
    }

}

public class Solution {
}
