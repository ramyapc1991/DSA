package com.dsa.recursion;

public class SumOfNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(getSum(n));
    }

    private static int getSum(int n) {
        if(n==0)
            return 0;

        return n+getSum(n-1);
    }

}
