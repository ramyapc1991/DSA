package com.dsa.mathematics;

import java.util.Scanner;

class ConvertCtoFehrenheit {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();//input number of testcases
        while(T-->0)
        {
            CelsiusToFahrenheit obj=new CelsiusToFahrenheit();

            int C;
            C=sc.nextInt();//input temperature in celscius

            System.out.println((int)(obj.cToF(C)));//print the output
        }

    }
}
// } Driver Code Ends


//User function Template for Java


class CelsiusToFahrenheit
{
    public double cToF(int C)
    {
        //Your code here
        return C * 9/5 + 32;
    }
}