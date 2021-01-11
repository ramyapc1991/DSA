package com.dsa.recursion;

public class RopeCutting {
    public static void main(String[] args) {
        int n=5, a=4, b=2,c=6;
        System.out.println(maxPieces(n,a,b,c));
    }

    private static int maxPieces(int n, int a, int b, int c) {
        if(n == 0)
            return 0;
        if(n < 0 )
            return -1;

        int res = MaxOf3(maxPieces(n-a,a,b,c), maxPieces(n-b,a,b,c),maxPieces(n-c,a,b,c));

        if(res == -1)
            return -1;

        return res+1;
    }

    private static int MaxOf3(int maxPieces1, int maxPieces2, int maxPieces3) {
        if (maxPieces1 >= maxPieces2 && maxPieces1 >= maxPieces3)
            return maxPieces1;
        else if(maxPieces2 >= maxPieces1 && maxPieces2 >= maxPieces3)
            return maxPieces2;
        else
            return maxPieces3;
    }
}
