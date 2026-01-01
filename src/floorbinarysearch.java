public class floorbinarysearch {
    public static void main(String[] args) {
        int[] array = {10,30,50,55,90};
        int target = 8;
//        System.out.println(binarysearch(array,target));
        int result = binarysearch(array,target);
        System.out.println(result);
    }

    static int binarysearch(int[] array,int target) {
        int start = 0;
        int end = array.length - 1;

        while (start<=end) {
            int mid = start + ( end - start ) / 2;

            if (target >array[mid])  {
                start =mid + 1;
            }
            else if (target < array[mid]) {
                end = mid - 1;
            }
            else return mid;
        }
        return end;
    }
}
