import java.lang.annotation.Target;
import java.util.Arrays;
public class basicbinarysearch {
    public static void main(String[] args) {
        int[] array = new int[1000000];
        int target = 51000;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
//        int index = Arrays.binarySearch(array, target);

//        using direct library function to do it
        int index = binarysearch(array ,target);
        if (index == -1) {
            System.out.println(target + "target not found ");
        } else {
            System.out.println("element found at " + index);
        }
    }

    private static int binarysearch(int[] arr, int tar) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = arr[middle];
            System.out.println("middle " + value);

            if (tar > value) {
                low = middle + 1;
            } else if (tar < value) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}


