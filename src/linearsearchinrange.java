public class linearsearchinrange {
    public static void main(String[] args) {
        int[] arr = {19,45,22,63,82,55};
        int target = 63;
        System.out.println(linearsearchinrange(arr,target,1,4));
    }
    static int linearsearchinrange(int[] arr,int target,int start,int end ) {
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
