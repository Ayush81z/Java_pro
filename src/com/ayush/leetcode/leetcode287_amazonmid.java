package com.ayush.leetcode;

public class leetcode287_amazonmid {

    public int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int realindex = arr[i]-1;

            //swaps if arr[i] is within the range and not already in the correct position
            if (arr[i] != arr[realindex]) {
                int temp = arr[i];
                arr[i] = arr[realindex];
                arr[realindex] = temp;
            }
            else {
                i++;
            }
        }
        //search for the misiing number
        for (int index=0 ; index<arr.length; index++) {
            if (arr[index] != index+1) {
                //here we are using index+1 because the value starts from (1 to n) we cant compare the value which starts from 1 with the index directly so we use index+1 to compare if it is correct or not , when the match fails then it returns the value

                return arr[index];
            }
        }
        //or return the value n
        return -1;
    }
}
