package com.ayush.ArraytwoD;

import java.util.Arrays;

public class setMatrixZeros_lc73 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0,1},
                {0,1,1,1},
                {1,0,1,1},
                {1,1,1,1}
        };
        setZeroes(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    public static void setZeroes(int[][] matrix) {
        int x = 1;
        int y = 1;
        int m = matrix.length; //rows
        int n = matrix[0].length; //column

        for (int i = 0; i < m ; i++) {
            if (matrix[i][0] == 0) {
                y = 0;
            }
        }

        for (int j = 0; j < n ; j++) {
            if (matrix[0][j] == 0) {
                x = 0;
            }
        }

        for (int i = 1 ; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    //marking the first row and the column as zero
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1 ; i < m ; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0 ; j < n ; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 1 ; j < n ; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 0 ; i < m ; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (x == 0) {
            for (int j = 0 ; j < n ; j++) {
                matrix[0][j] = 0;
            }
        }

        if (y == 0) {
            for (int i = 0 ; i < m ; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
