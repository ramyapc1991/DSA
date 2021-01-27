package com.dsa.searching;

public class ItrBSearchIndexOfFirstOcc {
    public static void main(String[] args) {
        int arr[] = {5,10,10,15,20,20,20};
        int x = 10;
        System.out.println("The First Occurrence of "+x +" found at position "+ firstOcc(arr, arr.length, x));
    }

    private static int firstOcc(int[] arr, int n, int x) {
        int low=0, high=n-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid] < x){
                low = mid+1;
            }else if(arr[mid] > x){
                high = mid-1;
            }else{
                if(mid==0 || arr[mid-1] != arr[mid])
                    return mid;
                else
                    high = mid-1;
            }
        }
        return -1;
    }
}
