package com.dsa.arrays;
// { Driver Code Starts
import java.io.*;
import java.util.*;

public class LeaderInAnArray {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases

        while(t-->0){

            //input size of array
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");

            //inserting elements in the array
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Leader obj = new Leader();

            StringBuffer str = new StringBuffer();
            ArrayList<Integer> res = new ArrayList<Integer>();

            //calling leaders() function
            res = obj.leaders(arr, n);

            //appending result to a String
            for(int i=0; i<res.size(); i++){
                str.append(res.get(i)+" ");
            }

            //printing the String
            System.out.println(str);
        }

    }
}
// } Driver Code Ends


class Leader{
    static ArrayList<Integer> leaders(int arr[], int n) {
        // Your code here
        int[] ldr = new int[n];
        int j = 0;
        int cur_ldr = arr[n - 1];
        ldr[j++] = cur_ldr;

        for (int i = n - 2; i >= 0; i--) {
            if(cur_ldr <= arr[i]){
                cur_ldr = arr[i];
                ldr[j++] = cur_ldr;
            }
        }

        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i = n-1;i>=0;i--){
            if(ldr[i] !=0){
                res.add(ldr[i]);
            }

        }
        return res;
    }
}

