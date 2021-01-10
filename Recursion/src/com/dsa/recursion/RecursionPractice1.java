package com.dsa.recursion;

public class RecursionPractice1 {
    public static void main(String[] args) {
        int n=3;
        fun1(n);
    }

    private static void fun1(int n) {
        if(n==0)
            return;
        fun1(n-1);
        System.out.println(n);
        fun1(n-1);
    }
}
