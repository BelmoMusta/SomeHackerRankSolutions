package javaProblems.advanced.varargs;

/**
 * <a href="https://www.hackerrank.com/challenges/simple-addition-varargs">Problem statement</a>
 */

public class Solution {

    public static void main(String[] args) {

        Add a = new Add();
        a.add(1, 2, 3);

    }

}

class Add {

    public void add(int... args) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < args.length; i++) {

            sum += args[i];
            if (i == args.length - 1) {

                sb.append(args[i]).append("=").append(sum);
            } else {
                sb.append(args[i]).append("+");
            }


        }


        System.out.println(sb.toString());

    }


}
