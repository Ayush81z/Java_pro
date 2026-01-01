package com.ayush.recursion;

import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
//        subsequence("","abc");
        subsequence2("","abc");
        System.out.println(ace);
    }
    // method 1 : without arraylist
//    static void subsequence(String p , String up) {
//        if (up.isEmpty()) {
//            System.out.println(p);
//            return;
//        }
//
//        char ch = up.charAt(0);
//        //add it
//        subsequence(p+ch, up.substring(1));
//
//        //or remove it
//        subsequence(p,up.substring(1));
//    }


    //method 2 : with arraylist

    static ArrayList<String> ace = new ArrayList<String>();
    static void subsequence2(String p , String up) {
        if (up.isEmpty()) {
            ace.add(p);

            return;
        }

        char ch = up.charAt(0);
        //add it
        subsequence2( p+ch, up.substring(1));

        //or remove it
        subsequence2(p,up.substring(1));
    }

}



