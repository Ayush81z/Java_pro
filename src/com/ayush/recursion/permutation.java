package com.ayush.recursion;

public class permutation {
    public static void main(String[] args) {
        permutations(" ", "abc");
    }


    static  void permutations ( String p , String up) {
        if (up.isEmpty()) {  //base condition
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);  //un processed gets updated every recursion call and new char are taken

        for (int i = 0; i < p.length() ; i++) {
            String start = p.substring(0 , i);
            //substring breaks the string into smaller versions by breaking down into smaller ones
            String end = p.substring(i , p.length());
            permutations(start + ch + end , up.substring(1));  //updates the unprocessed once its processed
        }

    }
}
