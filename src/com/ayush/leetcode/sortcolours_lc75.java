package com.ayush.leetcode;

import java.util.Arrays;

public class sortcolours_lc75 {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortColors(int[] nums) {
        //improving using three pointer
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        //using no sorting to get that 0(n)
        while (mid <= high ) {
            if (nums[mid] == 0) {
                swap(nums , mid , low);
                mid++; low++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else if (nums[mid] == 2 ) {
                swap(nums , mid , high);
                high--;
            }
        }
    }

    public static int[] swap(int[] nums, int ind1 , int ind2) {
        int temp = nums[ind1];
        nums[ind1] = nums[ind2];
        nums[ind2] = temp;
        return nums;
    }

}
