package com.ayush.leetcode;

import java.util.Arrays;
public class leetcode_455 {
    public static void main(String[] args) {
        int g[] = {10 , 9 , 8 , 7};
        int s[] = {5,6,7,8};
        System.out.println(find(g, s));
    }



    public static int find(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;

        int i = 0 , j = 0;
        if ( g.length == 0 || s.length==0) return 0;
        while(i<g.length && j<s.length) {

            if (s[j] >= g[i]) {
                i++;
            }
            j++;

        }
        return i;
    }
}


