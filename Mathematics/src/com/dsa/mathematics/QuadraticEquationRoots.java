package com.dsa.mathematics;


import java.io.*;
import java.util.*;

class QuadraticEquationRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
            if (ans.size() == 1 && ans.get(0) == -1)
                System.out.print("Imaginary");
            else
                for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> values = new ArrayList<Integer>();
        int root1, root2;
        int rootValue = (int) (Math.pow(b, 2) - 4 * a * c);

        if(rootValue<0){
            values.add(-1);
        }else{
            root1 = (int) Math.floor((-1 * b + Math.sqrt(rootValue)) / (2 * a));
            root2 = (int) Math.floor((-1 * b - Math.sqrt(rootValue)) / (2 * a));

            values.add(Math.max(root1, root2));
            values.add(Math.min(root1, root2));
        }


        return values;
    }
}

