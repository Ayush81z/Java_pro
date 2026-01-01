package com.ayush.leetcode;

import java.util.Arrays;
public class leetcode167 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int  target =9;
        System.out.println(Arrays.toString(twosumtwo(arr,target)));
    }

    static int[] twosumtwo( int[] arr , int target) {
        for (int i=0; i<arr.length-1 ; i++) {
        int start = i+1;
        int end = arr.length-1;

        while ( start <= end) {
            int mid = start + (end-start)/2;
                if (arr[mid] == target - arr[i]) {
                    return new int[]{i+1,mid+1};
                }
                else if (arr[mid] < target -arr[i]){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return new int[]{-1,-1};
    }

}