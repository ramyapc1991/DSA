package com.dsa.recursion;

public class Print1ToNTailRecursive {
    public static void main(String[] args) {
        int n =5;
        int k =1;
        tailRecursive1ToN(n,k);
    }

    private static void tailRecursive1ToN(int n, int k) {
        if(n==0)
            return;
        System.out.println(k);
        tailRecursive1ToN(n-1,k+1);
    }

}
