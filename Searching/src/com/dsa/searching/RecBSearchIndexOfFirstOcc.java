package com.dsa.searching;

public class RecBSearchIndexOfFirstOcc {
    public static void main(String[] args) {
        int arr[] = {5,10,10,15,20,20,20};
        int x = 20;
        System.out.println("The First Occurrence of "+x +" found at position "+ firstOcc(arr, arr.length, x));
    }

    private static int firstOcc(int[] arr, int n, int x) {
        int low = 0, high = n-1;
        return firstOS(arr, low,high,x);
    }

    private static int firstOS(int[] arr, int low, int high, int x) {
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if(arr[mid] > x)
            return firstOS(arr, low, mid-1,x);
        else if(arr[mid] < x)
            return firstOS(arr, mid+1, high, x);
        else {
            if (mid == 0 || arr[mid - 1] != arr[mid])
                return mid;
            else
                return firstOS(arr, low, mid - 1, x);
        }
    }

}
