package com.dsa.arrays;

import java.io.*;
import java.util.*;


    // } Driver Code Ends


//User function Template for Java

    // Solution class to implement function largestAndSecondLargest
public class StrongestNeighbour{

    // Function to find maximum of all adjacents
    static void maximumAdjacent(int sizeOfArray, int arr[]){

        /*********************************
         * Your code here
         * Function should print max adjacents for all pairs
         * Use string buffer for fast output
         * ***********************************/
        int[] prefix = new int[sizeOfArray-1];
        prefix[0] = Math.max(arr[0], arr[1]);
        for(int i =1 ;i<sizeOfArray;i++){
            prefix[i]= Math.max(arr[i],arr[i-1]);
        }
        for (int i = 0;i<prefix.length;i++)
            System.out.println(prefix[i]);
    }
}




// { Driver Code Starts.

// Driver class
class Array {

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

            StrongestNeighbour obj = new StrongestNeighbour();
            obj.maximumAdjacent(sizeOfArray, arr);

            System.out.println();
        }
    }
}


// } Driver Code Ends

