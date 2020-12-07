package com.dsa.mathematics;

import java.util.*;

class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of testcases
        while (T > 0) {
            int I = sc.nextInt();
            Absolute obj = new Absolute();
            System.out.println(obj.absolute(I));

            T--;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Absolute {
    public int absolute(int I) {
        // code here
        if(I < 0){
            return I*-1;
        }
        return I;
    }
}

