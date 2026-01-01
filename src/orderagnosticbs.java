public class orderagnosticbs {
    public static void main(String[] args) {
        int[] array = {90,66,55,33,21,17};
        int target = 33;

        int result = orderagnosticbs(array, target);
        System.out.println(result);
    }
    static int orderagnosticbs(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        //find whether the array iis sorted in ascending or desending
        boolean isasc = array[start] < array[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == target) {
                return mid-1;
            }
            if (isasc) {
                if (target > array[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < array[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}


