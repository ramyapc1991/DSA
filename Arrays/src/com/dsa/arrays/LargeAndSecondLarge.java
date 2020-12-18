package com.dsa.arrays;

import java.io.*;
import java.util.*;

class ArrayMax{

    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        ArrayList<Integer> list = new ArrayList<Integer>();
        int max = -1, sec_max = -1;
        for(int i =1;i<sizeOfArray;i++){
            if(arr[i]> max){
                sec_max = max;
                max= arr[i];
            }else if(arr[i]>sec_max && arr[i]!=max){
                sec_max= arr[i];
            }
        }

        list.add(new Integer(max));
        list.add(new Integer(sec_max));
        return list;
    }
}

// { Driver Code Starts.

// Driver class
public class LargeAndSecondLarge {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        // looping through all testcases
        while(testcases-- > 0){
            int sizeOfArray = Integer.parseInt(br.readLine());

            int arr[] = new int[sizeOfArray];

            String line = br.readLine();
            String[] elements = line.trim().split("\\s+");

            for(int index = 0;index < sizeOfArray; index++){
                arr[index] = Integer.parseInt(elements[index]);
            }

            ArrayMax obj = new ArrayMax();
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = obj.largestAndSecondLargest(sizeOfArray, arr);
            System.out.println(res.get(0) + " " + res.get(1) );
        }
    }
}  // } Driver Code Ends

