package com.ayush.binarysearch;

public class leetcode34 {

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        leetcode34 sol = new leetcode34();

        int[] result = sol.searchRange(nums, target);

        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = searchleft(nums , target);
        int second = searchright(nums , target);
        return new int[]{first , second};
    }

    public static int searchleft(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) /2;

            if (nums[mid] >= target) {
                if (nums[mid] == target) {
                    ans = mid;
                }
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return ans;
    }

    public static int searchright(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) /2;

            if (nums[mid] <= target) {
                if (nums[mid] == target) {
                    ans = mid;
                }
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return ans;
    }

//    public int[] searchRange(int[] nums, int target) {
//        int[] ans = {-1,-1};
//        ans[0] = search(nums,target, true);
//        ans[1] = search(nums, target, false);
//        return ans;
//    }
//
//
//    int search(int [] nums,int target, boolean startindex) {
//        int ans = -1;
//        int start = 0;
//        int end = nums.length - 1;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target < nums[mid]) {
//                end = mid - 1;
//            } else if (target > nums[mid]) {
//                start = mid + 1;
//            } else {
//                ans = mid;
//                if (startindex) {
//                    end = mid -1;
//                }
//                else {
//                    start = mid +1;
//                }
//            }
//        }
//        return ans;
//    }
}
