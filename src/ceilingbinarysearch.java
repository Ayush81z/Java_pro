public class ceilingbinarysearch {
    public static void main(String[] args) {
        int[] array = {10,30,50,55,90};
        int target = 32;
//        System.out.println(binarysearch(array,target));
        int result = ceiling(array,target);
        System.out.println(result);
    }
//ceiling : return the index of smallest number >= target
    static int ceiling(int[] array,int target) {
        int start = 0;
        int end = array.length - 1;

        //but when the target is the largest number in the array
        if (target>array[array.length-1]) {
            return -1;
        }

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
        return start;
    }
}
