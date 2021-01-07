package com.dsa.recursion;

public class BaseCondition {
    public static void main(String[] args) {
        fun1(2);
    }

    private static void fun1(int n) {
        if(n ==0)
            return;
        System.out.println("GFG");
        fun1(n-1);
    }
}
