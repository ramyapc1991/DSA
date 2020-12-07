package com.dsa.mathematics;

import java.io.*;
import java.util.*;
class DigitsInFactorial {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        //taking total testcases
        int T=sc.nextInt();

        while(T-->0)
        {
            DigitsFactorial obj=new DigitsFactorial();
            int N;

            //taking N
            N=sc.nextInt();

            //calling method digitsInFactorial()
            System.out.println(obj.digitsInFactorial(N));

        }

    }
}
// } Driver Code Ends


//User function Template for Java


class DigitsFactorial{
    public int digitsInFactorial(int N){
        // code here
        if(N <0)
            return 0;

        if(N<=1){
            return 1;
        }

        double value = 0;

        for(int i = 2; i<=N;i++){
            value = value + Math.log10(i);
        }

        return (int) (Math.floor(value)) +1;
    }
}

