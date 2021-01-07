package com.dsa.arrays;

// { Driver Code Starts
import java.util.*;


// } Driver Code Ends

public class SmallestPositiveMissingEle {

    // function to find first positive missing number
    static int missingNumber(int arr[], int size)
    {
        boolean[] present = new boolean[size + 1];

        for (int i = 0; i < size; i++) {
            if (arr[i] > 0 && arr[i] <= size)
                present[arr[i]] = true;
        }

        for (int i = 1; i <= size; i++)
            if (!present[i])
                return i;


        return size + 1;

    }

}


// { Driver Code Starts.

class Main
{
    public static void main (String[] args)
    {

        Scanner sc=new Scanner(System.in);

        //taking testcases
        int t=sc.nextInt();
        while(t-->0){

            //input number n
            int n=sc.nextInt();
            int[] arr=new int[n];

            //adding elements to the array
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            SmallestPositiveMissingEle obj = new SmallestPositiveMissingEle();

            //calling missingNumber()
            int missing = obj.missingNumber(arr,n);
            System.out.println(missing);
        }
    }
}

// } Driver Code Ends
