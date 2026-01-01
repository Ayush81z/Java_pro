package com.ayush.recursion;

public class sumofdig_recursion {
    public static void main(String[] args) {
    int n= 123;
        System.out.println(sumofdigit(n));
    }

    static int sumofdigit(int n ) {
        if (n==0) {
            return 0;
        }

        return sumofdigit(n/10) + (n%10);

    }
}
