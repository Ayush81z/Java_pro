package com.ayush.leetcode;

import java.util.*;

public class leetcode442 {
    public List<Integer> findDuplicates(int[] arr) {
        int i=0;
        List<Integer> list = new ArrayList<>();

        while ( i < arr.length) {
            int realindex = arr[i]-1;
            if ( arr[i] != arr[realindex]) {
                int temp = arr[i];
                arr[i] = arr[realindex];
                arr[realindex] = temp;
            }
            else {
                i++;
            }
        }
        for ( int index=0; index < arr.length; index++) {
            if (arr[index] != index+1 ) {
                list.add(arr[index]);
            }
        }
        return list;
    }
}
