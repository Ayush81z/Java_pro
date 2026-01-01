import java.util.Arrays;

public class twomatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(mat,49)));
    }


    static int[] search(int[][] mat, int target) {
        //using linear search
        int row= 0;
        int column = mat.length-1;

        while( row<mat.length && column>=0) {
            if(  mat[row][column]== target ) {
                return new int[]{row,column};
            }

            if (mat[row][column] <target ) {
                row++;
            }
            else {
                column--;
            }

        }
        return new int[]{-1,-1};
    }
}

