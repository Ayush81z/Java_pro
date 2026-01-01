package com.ayush.recursion;

public class maze_backtracking {
    public static void main(String[] args) {
        System.out.println(count(3,7));
    }

    static int count ( int row , int column){
        if ( row == 1 || column == 1) {
            return 1;
            //if there is only a single path to the final destination
        }

        int left = count (row-1 , column);
        int right = count (row , column-1);

        return left + right;
        
    }

}
