package com.ayush.recursion;

public class countzerorecursion {
    public static void main(String[] args) {
        int n = 605205408;
        System.out.println(zero(n));
    }

    static int zero ( int n) {
        if ( n==0) {
            return 0;
        }

        int lastdigit = n%10;
        if (lastdigit == 0) {
            return 1+zero(n/10);
        }
        else {
            return zero(n/10);
        }
    }
}
