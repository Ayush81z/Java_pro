package com.ayush.leetcode;

import java.util.ArrayList;
import java.util.List;

public class leadersinArray_A2Z {
    public static void main(String[] args) {
        int[] nums = {-3, 4, 5, 1, -4, -5};
        System.out.println(leaders(nums));
    }

    public static List<Integer> leaders(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
            boolean leader = true;
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[j] > nums[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                list.add(nums[i]);
            }
        }
        list.add(nums[nums.length-1]);
        return list;
    }
}
