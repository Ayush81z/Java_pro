package com.ayush.leetcode;

import java.util.Arrays;

public class nextpermutation_lc31 {

        public static void main(String[] args) {
            // Input array
            int[] nums = {1, 2, 2, 3, 2};
            nextPermutation(nums);
            System.out.println(Arrays.toString(nums));
        }

        public static void nextPermutation(int[] nums) {
            //-1 is being used as a sentinel value
            int index = -1;

            for (int i = nums.length-2 ; i >= 0 ; i--) {
                //to find the first decreasing element from the end
                if (nums[i] < nums[i+1]) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                reverse(nums , 0 , nums.length-1);
                return;
            }

            for (int i = nums.length - 1 ; i > index ; i--) {
                if (nums[i] > nums[index]) {
                    swap(nums ,i , index);
                    break;
                }
            }
            reverse(nums , index+1 , nums.length-1);
        }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end){
            swap(nums , start , end);
            start++;
            end--;
        }
    }

    public static int[] swap(int[] nums , int start , int end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            return nums;
    }
}


