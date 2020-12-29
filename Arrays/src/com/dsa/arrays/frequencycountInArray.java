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
        int [] fr = new int [arr.length];
        int visited = -1;
        for(int i=0;i<n;i++){
            int count = 1;
            for(int j=i+1;j<n;j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    //To avoid counting same element again
                    fr[j] = visited;


                }
            }
            if(fr[i] != visited)
                fr[i] = count;
        }
        arr =fr;
    }
}

