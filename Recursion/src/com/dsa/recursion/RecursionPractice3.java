package com.dsa.recursion;

public class RecursionPractice3 {
    public static void main(String[] args) {
        int n =4;
        System.out.println("Binary representation of number 4");
        fun(n);
        System.out.println("Binary representation of number 15");
        fun(15);
    }

    private static void fun(int n) {
        if(n==0)
            return;
        fun(n/2);
        System.out.println(n%2);
    }
}
