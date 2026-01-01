package com.ayush.leetcode;

//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class amazon_s2 {
    public static void main(String[] args) {
        int[] nums = {6, 7,8,9,10, 0, 1, 2,3,4,5};
        int pivot =  findpivot(nums);
        System.out.println(pivot+1);
    }

    public static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;

            }
            if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
