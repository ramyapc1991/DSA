package com.dsa.searching;

public class RecBSearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int x= 35;
        RecBSearch search = new RecBSearch();
        System.out.println("The searching element "+x +" found at position "+search.bSearch(arr, arr.length, x));
    }

    private int bSearch(int[] arr, int n, int x) {
        int low = 0, high = n-1;
        return binarySearch(arr,low,high,x);
    }

    private int binarySearch(int[] arr, int low, int high, int x) {
        if(low>high)
            return -1;
        int mid = (low +high)/2;
        if(arr[mid] == x)
            return mid;
        else if(arr[mid] > x)
            return binarySearch(arr, low, mid-1, x);
        else
            return binarySearch(arr, mid+1, high, x);
    }


}
