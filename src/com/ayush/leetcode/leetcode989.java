package com.ayush.leetcode;

import java.util.ArrayList;
import java.util.Collections;

class leetcode989 {
    public static void main(String[] args) {
        int[] num = {1,2,5,8};
        int k= 146;
        System.out.println(addToArrayForm(num,k));
    }




    public static ArrayList<Integer> addToArrayForm(int[] nums, int k) {
        ArrayList<Integer> fin = new ArrayList<>();
        for(int i=nums.length-1 ; i>=0 ; i--) {
           fin.add((nums[i] + k) %10);
           k = (nums[i]+k)/10;
        }

        while (k>0) {
            fin.add(k%10);
            k= k/10;
        }
        Collections.reverse(fin);
        return fin;

    }
}

