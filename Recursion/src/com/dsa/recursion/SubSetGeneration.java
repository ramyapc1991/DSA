package com.dsa.recursion;

public class SubSetGeneration {
    public static void main(String[] args) {
        subset("ABC", "", 0);

    }

    private static void subset(String s,String curr, int i) {
        if(i == s.length())
        {
            System.out.println(curr);
            return;
        }
        subset(s, curr, i+1);
        subset(s, curr+s.charAt(i), i+1);
    }
}
