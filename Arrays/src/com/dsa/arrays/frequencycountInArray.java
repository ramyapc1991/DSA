package com.dsa.arrays;

import java.io.*;
import java.util.*;

public class frequencycountInArray {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //testcases
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){

            //size of array
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements to the array
            for(int i=0; i<n; i++){
                arr[i]=Integer.parseInt(inputLine[i]);
            }

            //calling frequncycount() function
            Frequency obj = new Frequency();
            obj.frequencycount(arr, n);

            //printing array elements
            for(int i=0; i<n; i++)
                System.out.print(arr[i] + " " );
            System.out.println();
        }
    }
}



// } Driver Code Ends


class Frequency{
    public static void frequencycount(int arr[], int n)
    {
        // code here
//        for(int i=0;i<n;i++){
//            arr[i]= arr[i]-1;
//        }
//        for (int i=0; i < n; i++){
//            arr[arr[i]%n] = arr[arr[i]%n]+n;
//        }

        for (int j =0; j<n; j++)
            arr[j] = arr[j]-1;

        // storing the frequency of elements using mathematical formula
        for (int i=0; i<n; i++)
            arr[arr[i]%n] = arr[arr[i]%n] + n;

        //taking out frequency of each element
        for (int i =0; i<n; i++)
            arr[i] = (arr[i]/n);

    }
}

