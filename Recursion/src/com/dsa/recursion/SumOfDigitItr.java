package com.dsa.recursion;

public class SumOfDigitItr {
    public static void main(String[] args) {
        int n = 235;
        System.out.println("====="+getSum(n));
    }

    private static int getSum(int n) {
        int res=0;
        while(n>0){ 
            res = res + n % 10;
            n = n / 10;
        }
        return res;
    }
}
