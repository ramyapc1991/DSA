package com.dsa.mathematics;

import java.io.*;
import java.util.*;
class GPTerms {
    public static void main (String[] args) {

        //taking input using Scanner class
        Scanner sc=new Scanner(System.in);

        //taking total testcases
        int T=sc.nextInt();
        while(T-->0)
        {

            GP  obj=new GP ();
            int A,B;

            //taking A and B
            A=sc.nextInt();
            B=sc.nextInt();
            int N;

            //taking N
            N=sc.nextInt();

            //calling method termOfGP() of class GP
            System.out.println((int)Math.floor(obj.termOfGP(A,B,N)));

        }

    }
}
// } Driver Code Ends


//User function Template for Java

class GP
{

    public double termOfGP(int A,int B,int N)
    {
        //Your code here
        double r =((double)B)/ A ;
        return (A * Math.pow(r, N - 1)) ;

    }

}

