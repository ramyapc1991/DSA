package com.dsa.arrays;

import java.util.*;
import java.io.*;
import java.lang.*;

public class RotateAnArray
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //taking testcases
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            String str=br.readLine();
            String[] starr=str.split(" ");

            //input n and d
            int n=Integer.parseInt(starr[0]);
            int d= Integer.parseInt(starr[1]);

            int[] arr=new int[n];
            String str1=br.readLine();
            String[] starr1=str1.split(" ");

            //inserting elements in the array
            for(int j=0;j<n;j++)
            {
                arr[j]= Integer.parseInt(starr1[j]);
            }

            //calling rotateArr() function
            new Solution34().rotateArr(arr, d, n);
            StringBuffer sb=new StringBuffer();

            //printing the elements of the array
            for(int t1=0;t1<n;t1++)
                sb.append(arr[t1]+" ");
            System.out.println(sb);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution34
{
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
//        for(int i=0;i<d;i++){
//            rotateArrayByOne(arr,n);
//        }

        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }

    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);

    }


    private static void rotateArrayByOne(int[] arr, int n) {
        int temp= arr[0];
        for(int i =0;i<n-1;i++)
            arr[i]=arr[i+1];

        arr[n-1] = temp;
    }
}

