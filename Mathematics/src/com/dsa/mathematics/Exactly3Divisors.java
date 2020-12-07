package com.dsa.mathematics;

import java.io.*;
import java.util.*;

import static java.lang.Math.sqrt;

class Exactly3Divisors {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);



        //taking testcases
        int T=sc.nextInt();

        while(T-->0)
        {
            Divisors obj=new Divisors();
            int N;
            N=sc.nextInt();//taking N

            //calling function exactly3Divisors()
            System.out.println(obj.exactly3Divisors(N));


        }

    }
}
// } Driver Code Ends


//User function Template for Java


class Divisors
{
    public int exactly3Divisors(int N)
    {
//        //Your code here

        int counter=0; //Initializing counter to zero
        N = (int) Math.sqrt(N);

        for(int i=1;i<=N;i++) //running a loop from 1 to N
        {
            // A number N only has 3 divisors if it is a perfect square and its square root is a prime number,
            //  and we know the number of perfect squares less than N which is sqrt(N),
            // so just checking if i is prime or not
            if(isPrime(i))
                counter++;
        }
        return counter;


//        boolean[] prime = new boolean[N+1];
//        Arrays.fill(prime, true);
//        prime[0] = prime[1] = false;
//        int count =0;
//        for (int p = 2; p*p <= N; p++)
//        {
//            if (prime[p] == true)
//            {
//                count++;
//                for (int i=p*2; i<=N; i += p)
//                    prime[i] = false;
//            }
//        }
//
//
//        System.out.println("Numbers with 3 divisors : ");
//       // int count =0;
////        for (int i=0;  i*i <= N ; i++){
////            if (prime[i]){
////                count++;
////                System.out.print(i*i + " ");
////            }
////        }
//
//
//        return count;

    }

    boolean isPrime(int n)
    {
        if(n<=1)
            return false;

        for(int i=2;i<=sqrt(n);i++)
            if(n%i==0)
                return false;

        return true ;
    }
}


