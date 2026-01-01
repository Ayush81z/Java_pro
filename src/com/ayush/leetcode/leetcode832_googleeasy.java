package com.ayush.leetcode;

public class leetcode832_googleeasy{
    public int[][] flipAndInvertImage(int[][] image) {
                for (int[] row: image) {  //every individual row in the array image
                    int start= 0 , end = row.length-1;
                    while (start <= end) {   // becomes false (1 < 1 is false)
                        int temp = row[start]^1;  //flipping the numbers
                        row[start] = row[end]^1;    //flipping the numbers
                        row[end] = temp;
                        start++;
                        end--;
                    }
                }
                return image;
    }
}

