package com.ayush.leetcode;

public class leetcode344 {
    public static void main(String[] args) {
        char[] s = { 'h','e','l','l','o'};
        reversestring(s);
        System.out.println(s);
    }

    public static void reversestring ( char[] s) {
        int i = 0 , j = s.length-1;

        while (i < j ) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;

        }
    }
}
