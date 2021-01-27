package com.dsa.searching;

public class IndexOfFirstOcc {
    public static void main(String[] args) {
        int arr[] = {5,10,10,15,20,20,20};
        int x = 20;
        System.out.println("The First Occurrence of "+x +" found at position "+ firstOcc(arr, arr.length, x));
    }

    private static int firstOcc(int[] arr, int n, int x) {
        for(int i=0;i<n;i++)
            if(arr[i] == x)
                return i;

        return -1;
    }

}
