package com.dsa.recursion;


import java.io.*;
import java.math.*;

class sample {
    public static void main(String[] args) {
        System.out.println(isStream("sssaannntttaaa", "santa"));
        System.out.println(isStream("pppaaannndddaaa", "panda"));
    }

    private static boolean isStream(String str1, String str2) {

        char ch[] = str1.toCharArray();
        int i =1;
        int count =1;
        int prevCount =0;
        boolean flag = false;
        String str = String.valueOf(ch[i]);
        while (i<ch.length){
            if(ch[i-1] == ch[i]){
                count++;
                i++;
            }
            else{
                if(prevCount!=0){
                    if(prevCount == count){
                        flag = true;
                        prevCount = count;
                        count =1;
                        str = str + ch[i];
                    }
                    else {
                        flag = false;
                        break;
                    }
                }else{
                    prevCount = count;
                    count =1;
                    str = str + ch[i];
                }

                i++;
            }
        }
        return ((str.equals(str2)) && flag);
    }


}
