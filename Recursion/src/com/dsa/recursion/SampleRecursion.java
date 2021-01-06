package com.dsa.recursion;

public class SampleRecursion {
    public static void main(String[] args) {
        System.out.println("Before fun2");
        fun2();
        System.out.println("After fun2");
    }

    private static void fun2() {
        System.out.println("before fun1");
        fun1();
        System.out.println("after fun1");
    }

    private static void fun1() {
        System.out.println("Fun1");
    }
}
