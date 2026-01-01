package com.ayush.leetcode;

public class leetcode485 {
    public static void main(String[] args) {
     int []arr = {1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
        public static int findMaxConsecutiveOnes(int[] arr) {
            int count = 0;
            int max = 0;
            for (int i=0; i<arr.length-1; i++) {
                if (arr[i] == 1){
                    count++;
                    max = Math.max(max,count);
                }
                else {

                    count = 0;
                }
            }
            return max;
        }
    }

