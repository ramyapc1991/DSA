package com.dsa.recursion;

public class Print1toNRecursion {
    public static void main(String[] args) {
        int n = 4;
        print1ToN(n);
    }

    private static void print1ToN(int n) {
        if(n==0)
            return;
        print1ToN(n-1);
        System.out.println(n);
    }
}
