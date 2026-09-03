package com.ayush.leetcode;

public class FindMinimumRotatedsorted_lc153 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while (start < end) {
            int mid = start + (end-start)/2;

            if (nums[mid] > nums[end]) {
                start = mid+1;
            }
            else if (nums[mid] < nums[end]) {
                end = mid;
            }
        }
        return nums[start];
    }
}
