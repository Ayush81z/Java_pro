package com.ayush.leetcode;
import java.util.ArrayDeque;

public class leetcode189 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2};
        int k = 2;
        rotate(nums, k);
        System.out.println(java.util.Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k% nums.length;
        }
        reverse(nums,0, nums.length-1);
        reverse(nums, 0 , k-1);
        reverse(nums,k, nums.length-1);
    }

    public static void reverse(int[] nums, int start , int end) {
        int temp = 0;
        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


//using deque
//    public static  void rotate(int[] nums, int k) {
//        ArrayDeque<Integer> deque = new ArrayDeque();
//        int index = nums.length-1;
//        int temp = k;
//        while (temp > 0) {
//            deque.addFirst(nums[index]);
//            index--;
//            temp--;
//        }
//        int itterate = nums.length - k;
//
//        for (int i = 0; i < itterate; i++) {
//            deque.addLast(nums[i]);
//        }
//        System.out.println(deque);
//
//    }
}
