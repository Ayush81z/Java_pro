package com.ayush.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class twosum_lc1 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    //most optimal approach
    public static  int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];

            if (map.containsKey(remaining)) {
                return new int[]{map.get(remaining), i};
            }

            map.put(nums[i] , i);
        }
        return new int[]{};
    }
}
