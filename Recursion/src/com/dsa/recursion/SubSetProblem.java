package com.dsa.recursion;

public class SubSetProblem {
    public static void main(String[] args) {
        int arr[]= {10,5,2,3,6};
        int n =5;
        int sum= 8;
        System.out.println(countSubSets(arr,n,sum));
    }

    private static int countSubSets(int[] arr, int n, int sum) {
        if(n == 0)
            return sum == 0 ? 1 : 0;

        return countSubSets(arr, n-1, sum) + countSubSets(arr,n-1, sum - arr[n-1]);
    }

}
