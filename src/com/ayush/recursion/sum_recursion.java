package com.ayush.recursion;

public class sum_recursion {
    public static void main(String[] args) {
        int n = 678;
        System.out.println(sum(n));
    }

    static int sum(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return sum(n / 10) + n % 10;
        }
        
    }
}
