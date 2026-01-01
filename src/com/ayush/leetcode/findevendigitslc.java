package com.ayush.leetcode;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class findevendigitslc {
    public static void main(String[] args) {
        int[] arr = {18,124,1456,543,7,999,24};
        System.out.println(findnumbers(arr));
    }

    static int findnumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                return -1;
            }
            if (String.valueOf(num).length() % 2 == 0) {//The String.valueOf() method in Java is a static method of the String class. It is used to convert various types of data (e.g., primitives, objects) into their String representation.

                count++;
            }
        }
        return count;
    }

//    static int logmethod(int num) {
//        return (int)(Math.log10(num))+1;
//    } shortcut

}
