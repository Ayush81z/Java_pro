package com.ayush.binarysearch;

class Solution {
    public static void main(String[] args) {

        char[] letters = {'c', 'f', 'j'};
        char target = 'c';

        Solution sol = new Solution();
        char result = sol.nextGreatestLetter(letters, target);

        System.out.println(result);
    }
    //easier flow of program and we let binary search reduce the search elem
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        char small = letters[0];

        while (start <= end) {
            int mid =  start + (end - start)/2;

            if (letters[mid] > target) {
                small = letters[mid];
                end = mid-1;
            }
            else {
                start = mid +1;
            }
        }
        return small;
    }

//    public char nextGreatestLetter(char[] letters, char target) {
//        int start = 0;
//        int  end = letters.length - 1;
//
//
//        while (start<=end) {
//            int mid = start + ( end - start ) / 2;
//
//            if (target <letters[mid])  {
//                end =mid - 1;
//            }
//            else {
//                start = mid + 1;
//            }
//
//        }
//        return letters[start % letters.length];
//        //s%n is used
//
//    }
}
