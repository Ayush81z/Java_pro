import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr) {
        boolean swapped;
        for (int i=0; i<arr.length ; i++) {
            swapped = false;
            //run the steps n-1 times
            for (int j=1; j<arr.length-i;j++){

                //run the loop until the first parse is completed
                if ( arr[j-1] > arr[j] ) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

    }
}
