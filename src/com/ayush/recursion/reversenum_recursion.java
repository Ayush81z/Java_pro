package com.ayush.recursion;

public class reversenum_recursion {

    public static void main(String[] args) {
        int n = 678;
        int rev = reverse(n,0);
        System.out.println(rev);
    }

    public static int reverse(int n, int rev) {
        if (n==0) {
            return 0;
        }
        int rem = n%10;
        rev += rem;
        return reverse(n/10, rev);
    }
}
