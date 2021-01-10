package com.dsa.recursion;

public class RecursionPractice2 {
    public static void main(String[] args) {
        int n=16;
        int output = fun1(n);
        System.out.println(output);
    }

    private static int fun1(int n) {
        if(n==1)
            return 0;
        else
            return 1+fun1(n/2);
    }

}
