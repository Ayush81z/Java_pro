package com.ayush.leetcode;

public class checkifArraySortedRotated_lc1752 {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4};
        System.out.println(check(nums));
    }

    public static boolean check(int[] nums) {
        //sort of like a mountain array prob
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            //% nums.length to compare the first and the last value
            if (nums[(i+1) % nums.length] < nums[i]) {
                count++;
            }
            if (count > 1) return false;
        }
        return true;
    }
}
