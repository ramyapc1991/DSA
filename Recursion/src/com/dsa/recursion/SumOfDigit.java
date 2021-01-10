package com.dsa.recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        int n =101;
        System.out.println(getSum(n));
    }

    private static int getSum(int n) {
        if(n==0)
            return 0;
        return getSum(n/10)+ n%10;
    }
}
