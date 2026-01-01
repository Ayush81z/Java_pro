package com.ayush.recursion;

public class reverse_recursion {
    public static void main(String[] args) {
        way2(7843);
        System.out.println(sum);
    }

    static int sum = 0;

//    static void way1(int n) {
//        if (n==0) {
//            return;
//        }
//        int rem = n%10;
//        sum = sum * 10 + rem;
//
//        way2(n/10);
//    }

    static void way2(int n) {
        int digit = (int)(Math.log10(n));

        if (n == 0) {
            return;
        }
        int rem = n%10;
        int np = n% 10;

        sum = rem * digit + np;

    }
}
