package com.dsa.arrays;

// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

public class RearrangeArray {
    public static void main (String[] args)throws IOException
    {

// 		Scanner in = new Scanner(System.in);

// 		int t = in.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        //testcases
        int t = Integer.parseInt(read.readLine());

        while(t-- >0)
        {
            //size of array
            int n = Integer.parseInt(read.readLine());
            int[] temp= new int[n];

            String str[] = read.readLine().trim().split(" ");

            //adding elements to the array
            for(int i=0;i<n;i++)
                temp[i] = Integer.parseInt(str[i]);

            // StringBuffer sb = new StringBuffer();

            RearrangeAlternate obj = new RearrangeAlternate();

            //calling rearrange() function
            obj.rearrange(temp, n);
            StringBuffer sb = new StringBuffer();

            //appending and printing the elements
            for(int i =0; i < n; i++)
                sb.append(temp[i] + " ");
            System.out.println(sb);
        }
    }
}



// } Driver Code Ends


class RearrangeAlternate{

    // This function wants you to rearrange the temp array as required
    // and returns a StringBuffer with all elements of modified temp array
    // appended to it.
    // temp: input array
    // n: size of array
    public static void rearrange(int arr[], int n){

        // Your code here
//        int temp;
//        for (int i = 0; i < arr.length; i++) {
//            if (i % 2 == 0) {
//                // Store the last element to 'temp'
//                temp = arr[arr.length - 1];
//                // Shift all elements, starting from index, 'i', to one place right
//                for (int j = arr.length - 2; j >= i; j--) {
//                    arr[j + 1] = arr[j];
//                }
//                // Put the value stored in 'temp' to index, 'i'
//                arr[i] = temp;
//            }
//        }

        for(int i = 0; i<n; i++){
            if(i%2 == 0){
                swapMax(arr, i, n);
            }
            else swapMin(arr, i, n);
        }

    }
    public static void swapMax(int arr[], int i, int n){
        int x = arr[i];
        int j;
        for(j = n-1; j>i; j--){
            if(arr[j] > x){
                break;
            }
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void swapMin(int arr[], int i, int n){
        int x = arr[i];
        int j;
        int res = n-1;
        for(j = n-1; j>i; j--){
            if(arr[j] < x){
                if(arr[j] < arr[res]){
                    res = j;
                }
            }
        }
        int temp = arr[i];
        arr[i] = arr[res];
        arr[res] = temp;
    }

}