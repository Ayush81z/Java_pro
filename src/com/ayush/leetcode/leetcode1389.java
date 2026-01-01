package com.ayush.leetcode;

public class leetcode1389 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int n = nums.length;
        int[] result = new int[n];
        int size = 0;

        for (int i = 0; i < n; i++) {
            int insertPos = index[i];

            // Shift elements to the right to make room if needed
            for (int j = size; j > insertPos; j--) {
                result[j] = result[j - 1];
            }

            result[insertPos] = nums[i];
            size++;
        }

        // Print the final result
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
