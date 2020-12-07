package com.dsa.mathematics;


import java.io.*;
import java.util.*;
class ModularMultiplicativeInverse {
    public static void main (String[] args) {

        //taking input using Scanner class
        Scanner sc=new Scanner(System.in);

        //taking testcases
        int T=sc.nextInt();

        while(T-->0)
        {
            Modular  obj=new Modular ();
            int a,m;


            //taking input a and m
            a=sc.nextInt();
            m=sc.nextInt();



            //calling function modInverse()
            System.out.println(obj.modInverse(a,m));


        }

    }
}

// } Driver Code Ends


//User function Template for Java


class Modular
{

    public int modInverse(int a, int m)
    {
        //Your code here
        for(int i =1; i<=m ;i++){
            if(((a*i) % m ) == 1 ){
                return i;
            }
        }
        return 0;
    }

}


