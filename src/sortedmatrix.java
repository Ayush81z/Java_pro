import java.util.Arrays;

public class sortedmatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 100, 110, 120},
                {130, 140, 150, 160}
        };
        System.out.println(Arrays.toString(sortedMatrix(mat, 130)));
    }

    // Binary search in a row between specified column range
    static int[] binarySearch(int[][] mat, int target, int cstart, int cend, int row) {
        while (cstart <= cend) { // Changed condition from `<` to `<=`
            int mid = cstart + (cend - cstart) / 2;
            if (mat[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (mat[row][mid] < target) {
                cstart = mid + 1;
            } else {
                cend = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] sortedMatrix(int[][] mat, int target) {
        int rows = mat.length;
        int columns = mat[0].length;

        if (rows == 1) {
            return binarySearch(mat, target, 0, columns - 1, 0);
        }

        int rstart = 0;
        int rend = rows - 1;
        int cmid = columns / 2;

        // Iterating until only 2 rows remain
        while (rstart < rend - 1) {
            int mid = rstart + (rend - rstart) / 2;
            if (mat[mid][cmid] == target) {
                return new int[]{mid, cmid};
            }
            if (mat[mid][cmid] < target) {
                rstart = mid;
            } else {
                rend = mid;
            }
        }

        // Check the middle elements in the last two rows
        if (mat[rstart][cmid] == target) {
            return new int[]{rstart, cmid};
        }
        if (mat[rstart + 1][cmid] == target) {
            return new int[]{rstart + 1, cmid};
        }

        // Search in four quadrants
        if (target <= mat[rstart][cmid - 1]) {
            return binarySearch(mat, target, 0, cmid - 1, rstart);
        }
        if (target >= mat[rstart][cmid + 1] && target <= mat[rstart][columns - 1]) {
            return binarySearch(mat, target, cmid + 1, columns - 1, rstart);
        }
        if (target <= mat[rstart + 1][cmid - 1]) {
            return binarySearch(mat, target, 0, cmid - 1, rstart + 1);
        }
        return binarySearch(mat, target, cmid + 1, columns - 1, rstart + 1);
    }
}
