package com.ayush.leetcode;

public class leetcode7 {
    public static void main(String[] args) {
        int num = 2234;
        int reversed = 0;
        System.out.println(reverse (num , reversed));
    }

     static int reverse( int num , int reversed) {

        while (num != 0) {
            int digit = num % 10;
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE/10 && digit>7 )) { //sees to it that no value goes beyond this
                return 0;
            }
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE/10 && digit<-8 ) ) {
                return 0;
            }

            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        return reversed;
    }
}

