import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = {5,4,1,2,9,6,4,1};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionsort(int[] arr) {
        for (int i =0; i<arr.length-1; i++) {
            //here you can take i<= arr.length-2 also
            for(int j=i+1; j>0 ; j--) {
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else { // you can break cause it doesnt make sense to check more than that as it may already be sorted
                    break;
                }
            }
        }


    }

}
