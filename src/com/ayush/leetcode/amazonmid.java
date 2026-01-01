package com.ayush.leetcode;//amazon mid level question https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/


public class amazonmid {
    public static void main(String[] args) {
        int[] array =  {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target =100;
        System.out.println(ans(array,target));
    }
    static int ans(int[] array,int target) {
        int start = 0;
        int end = 1;
        int dub=2;
        while(target > array[end]) {
            start = dub;
            end = end*dub;
            dub*=2;
        }
        return binarysearch(array,target,start,end);
    }
    static int binarysearch(int[] array,int target,int start , int end) {

        while (start<=end) {
            int mid = start + ( end - start ) / 2;

            if (target <array[mid])  {
                end =mid - 1;
            }
            else if (target > array[mid]) {
                start = mid + 1;
            }
            else return mid;
        }
        return -1;
    }

}
