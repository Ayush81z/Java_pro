package com.ayush.leetcode;

public class leetcode645 {
    public int[] findErrorNums(int[] arr) {
        int i=0;
        while ( i < arr.length) {
            int realindex = arr[i]-1;
            if (arr[i] != arr[realindex]) {
                int temp = arr[i];
                arr[i] = arr[realindex];
                arr[realindex] = temp;
            }
            else {
                i++;
            }
        }
        //for repeating and missing together
        for ( int index=0;index <arr.length;index++) {
            if (arr[index] != index+1) {
                return new int[]{arr[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }
}
