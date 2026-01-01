package com.ayush.leetcode;

public class leetcode268 {
//amazon question
    //testcase
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,0};

        System.out.println(missingnumber(arr));
    }

    public static int missingnumber( int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int realindex = arr[i];


            //here the skipping part happenss as ,if the value is greater than the length of the array
            if (  arr[i] < arr.length && arr[i] != arr[realindex]) {
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
            if (arr[index] != index) {
                return index;
            }
        }
        //or return the value n
        return arr.length;
    }
}
