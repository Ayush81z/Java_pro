package com.ayush.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode_66 {
    public int[] plusOne(int[] arr) {
        for (int i = arr.length-1 ; i >= 0 ; i--) {
            //if less than 9 just +1
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            // add 0 at the end if the last number is 9
            arr[i] = 0;
        }

        //if all the values are 9
        int[] narr = new int[arr.length+1];
        narr[0] = 1;
        return narr;

        // doesnt work due to int value bound overflow
//        int num=0;
//        for (int i = 0 ; i <= arr.length-1 ; i++) {
//            num = num * 10 + arr[i];
//        }
//        num += 1;
//
//        int len = (int) Math.log10(num) + 1;
//        int[] narr = new int[len];
//
//        for (int i = len-1; i >= 0 ; i--) {
//            narr[i] = num % 10;
//            num /= 10;
//        }
//        return narr;

    }


        public static void main(String[] args) {
            leetcode_66 sol = new leetcode_66();

            int[] digits = {9,8,7,6,5,4,3,2,1,0};
            int[] result = sol.plusOne(digits);

            System.out.println(Arrays.toString(result)); // [1, 0, 0, 0]
        }


}
