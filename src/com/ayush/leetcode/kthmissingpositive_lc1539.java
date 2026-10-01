package com.ayush.leetcode;

public class kthmissingpositive_lc1539 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,9};
        int k = 2;
        System.out.println(findKthPositive(arr , k));
    }
    public static int findKthPositive(int[] arr, int k) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return k + left;
    }
}
