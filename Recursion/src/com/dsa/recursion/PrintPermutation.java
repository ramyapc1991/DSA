package com.dsa.recursion;

public class PrintPermutation {
    public static void main(String[] args) {
        permute("ABCD", 0);
    }

    private static void permute(String s, int i) {
        if(i==s.length()-1)
            System.out.println(s);
        for(int j=i;j<s.length();j++){
            s=swap(s, i,j);
            permute(s,i+1);
            s=swap(s,j,i);
        }
    }

    static String swap(String str, int i, int j)
    {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }
}
