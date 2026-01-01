package com.ayush.leetcode;

import java.util.*;
public class leetcode448google {

    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> list = new ArrayList<>();
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
                list.add(index+1);
            }
        }
        //or return the value n
        return list;
    }
}
