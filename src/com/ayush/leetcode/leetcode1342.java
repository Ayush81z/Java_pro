package com.ayush.leetcode;

public class leetcode1342 {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(steps(n));
    }

    static int steps(int num ) {
        if ( num ==0) {
            return 0;
        }

        if (num%2 ==0 ){
            return 1+steps(num/2);
        }
        else {
            return 1+steps(num-1);
        }

    }
}
