package com.dsa.recursion;

public class FactTailRecursion {
    public static void main(String[] args) {
        int n=5; int k =1;
       System.out.println(factTailRecur(n,k));
    }

    private static int factTailRecur(int n, int k) {
        if(n==0 || n==1)
            return 1;
        return factTailRecur(n-1, k*n);
    }
}
