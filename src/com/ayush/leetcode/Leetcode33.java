package com.ayush.leetcode;

public class Leetcode33 {
    public int search(int[] nums, int target) {
        int pivot = findpivot(nums);

        if(pivot == -1) {
            return binarysearch(nums,target,0,nums.length-1);
        }
        if (nums[pivot]==target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarysearch(nums,target,0,pivot-1);
        }
        return binarysearch(nums,target,pivot+1,nums.length-1);
    }
    // this will not work for duplicate valuue
    //pivot is basically the largest element

    public int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while( start<= end) {
            int mid = start + ( end- start)/2;

            if( mid< end && arr[mid] > arr[mid+1] ) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;

            }
            if (arr[mid] <  arr[start] ) {
                end = mid-1;
            }
            else {
                start = mid +1;
            }


//            // this part is only if there are duplicate elements if  elements at mid , start , end are equal then just skip the duplicates
//            if ( arr[mid] == arr[start] &&  arr[mid] == arr[end]) {
//
//                //we are using this because to check if the start element is itself a pivot or not
//                if (arr[start] > arr[start+1]) {
//                    return start;
//                }
//                start++;
//                //we are increasing the count because if the start is equal to mid and end then it should be start + 1 , so  that we can get the pivot due to same value
//
//
//                //we are using this because to check if the end element is itself a pivot or not
//                if( arr[end] < arr[end-1]) {
//                    return end-1;
//                }
//                end--;
//            }
//            //left half is sorted as the pivot is in right side
//            else if((arr[start] < arr[mid]) || (arr[start] == arr[mid] && arr[mid] > arr[end] )) {
//                start = mid+1;
//            }
//            else {
//                end  = mid -1;
//            }
        }
//        return -1;



        return end;
    }
    static int binarysearch (int[] array,int target,int start, int end) {
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
