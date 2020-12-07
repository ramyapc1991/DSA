package com.dsa.mathematics;


import java.io.*;
import java.util.*;
class FactorialOfNumber {
    public static void main(String[] args) {

        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        //taking testcases
        int T = sc.nextInt();
        while (T-- > 0) {

            //creating an object of class Factorial
            Factorial obj = new Factorial();
            int N;

            //taking N
            N = sc.nextInt();

            //calling factorial() method
            //of class Factorial
            System.out.println(obj.factorial(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Factorial {

    public long factorial(int N) {
        // Your code here
        long res = 1;
        for(int i =2; i<=N; i++){
            res = res * i;
        }
        return res;
    }
}

