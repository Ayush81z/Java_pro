public class linearsearch {
    public static void main(String[] args) {
        int[] array = {44,23,14,87,9};
        int target = 14;
        int  result = linearsearch(array,target);
        System.out.println(result);

    }

    static int linearsearch(int[] arr,int target ) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0 ; index < arr.length; index++) {
            if (arr[index] == target ){
                return index;
            }
        }
        return -1;
    }

}