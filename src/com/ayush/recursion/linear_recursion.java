package com.ayush.recursion;

public class linear_recursion {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9};
        int target = 10;
        int i=0;
        System.out.println(linear(arr,target,i));
    }

    static boolean linear(int[] arr,int target , int i) {
        if (i == arr.length ) {
            return false;
        }

        return arr[i]==target || linear(arr,target,i+1);
    }
}
