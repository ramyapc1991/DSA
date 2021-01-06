package com.dsa.recursion;

public class DirectRecursionEx {
    public static void main(String[] args) {
        fun1();
    }

    private static void fun1() {
        System.out.println("GFG");
        fun1();
    }
}
