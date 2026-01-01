import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {5,4,1,2,9,6,4,1};
        selectionsorte(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionsorte(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-i-1;
            int max = findmax(arr,0,last);
            swap (arr,max,last);

        }
    }

    static void swap( int[] arr, int first , int end) {
        int temp = arr[first];
        arr[first] = arr[end];
        arr[end] = temp;
    }

    static int findmax(int[] arr, int start, int end ) {
        int max = start;
        for (int i=start; i<=end ; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

}
