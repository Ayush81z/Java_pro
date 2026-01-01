package com.ayush.leetcode;

public class leetcode410 {
    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i =0; i< nums.length ;i++ ){
            start = Math.max(start,nums[i]);
            end+=nums[i];
        }

        while(start < end) {
            int mid = start + (end-start) /2;

            //calculate how many times you can divide this with this max sum
            int sum=0;
            int pieces = 1;

            for ( int num : nums) {
                if ( sum + num > mid ) {
                    //you cannot add this to the subarray, make a new one
                    //when you create a new one it would be:
                    sum = num;
                    pieces++;
                }
                else {
                    sum += num;
                }
            }


            //we are using this because the given k limit is 2 , so if we cross the limit then it won't be valid so we need to increase the mid value so we take start as mid + 1 so that the mid value increases till we get the pieces under the m value which >= , check with example for better  understanding

            if(pieces > m) {
                start = mid+1;
            }
            //here if pieces <= m , update end at the final step , start, end , mid = the same value
            else {
                end = mid;
            }


        }
        //start === end , at the end
        return end;
    }

}
