package com.dsa.mathematics;



import java.math.BigInteger;
import java.util.*;
import java.io.*;
import java.lang.*;

class AdditionUnderModulo
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        //taking testcases
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0) {
            String[] str = read.readLine().trim().split(" ");

            //taking input a and b
            Long a = Long.parseLong(str[0]);
            Long b = Long.parseLong(str[1]);

            //calling method sumUnderModulo()
            System.out.println(new SolutionModule().sumUnderModulo(a,b));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class SolutionModule {
    public static long sumUnderModulo(long a, long b){
        // code here
//        BigInteger bigInta = BigInteger.valueOf(a);
//        BigInteger bigIntb = BigInteger.valueOf(b);
//        BigInteger res = bigInta.add(bigIntb);
//        return (res.longValue()) % ((Math.pow(10, 9) + 7));

        long mod = (long)(Math.pow(10, 9) + 7);
        return ((a %mod +b%mod) % mod);
    }
}

