package com.ayush.leetcode;

public class singleElemSortedArray_lc540 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,5,5,6,6};
        System.out.println(singleNonDuplicate(arr));
    }

    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while (start < end) {
            int mid = start + (end - start)/2;

            if (mid %2 == 1) mid--; //if not even then making it even to match the pair

            if (nums[mid] == nums[mid+1]) {
                //pair is complete , shift to next pair , giving that 0(log n)
                start = mid + 2;
            }
            else {
                end = mid;
            }
        }
        return nums[start];
    }
}
