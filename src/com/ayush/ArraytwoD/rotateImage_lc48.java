package com.ayush.ArraytwoD;

import java.util.Arrays;

public class rotateImage_lc48 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13,14,15,16}
        };
        rotate(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0 ; i < n ; i++) {
            for ( int j = i+1 ; j < n  ; j++) { //swap for the transpose of matrix
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n/2 ; j++) { //reverse for the ith place reverse of individual row reverse
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
}
