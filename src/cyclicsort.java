import java.util.Arrays;
//this is for index 3

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr= {1,6,4,2,3,5};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }
       static void cyclesort(int[] arr) {
        int i =0;
        //here all the index are starting at 0 so it wont go to next index so every number you swap would be checked if it is at the correct index or not if not then swap with the correct index

        while (i < arr.length) {
            int index = arr[i]-1;
            //for example if we have 5 at the starting index then 5-1 is the index which is 4 and stored in the var index and used to check thatif the value arr[i] which is 5 is equal to the index 4 if not then swap with the correct index

            if (arr[i] != arr[index]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
            //once swapping is done the arrray is updated and the updated array will again be checked for the same index whether the index value is at right position or not if its not then swap until it finds the right value for the index


            else {
                i++;
            }// no increment until the condition is met
        }
    }

       // you can also use this as a  function call
//    static void swap(int[] arr,int first ,int second) {
//        int temp = arr[first];
//        arr[first] =arr[second];
//        arr[second] = temp;
//    }

}
