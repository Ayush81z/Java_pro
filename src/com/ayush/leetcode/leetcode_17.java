package com.ayush.leetcode;

import java.util.ArrayList;

//was asked in google
public class leetcode_17 {
    public static void main(String[] args) {

        System.out.println(addin(" ", ""));

    }
//to just print the answer of the calculated
//    static void addin (String p , String up ) {
//        if (up.isEmpty()) {
//            System.out.println(p);
//            return;
//        }
//
//        int digit = up.charAt(0) - '0';
//
//        for (int i = (digit-1) *3 ; i < digit*3 ; i++) {
//            char ch = (char) ( 'a' + i);
//
//            addin(p+ch , up.substring(1));
//
//        }
//    }

    static ArrayList<String> addin (String p , String up ) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        String[] map = {"","",  "abc" ,"def" , "ghi" , "jkl" ,"mno" ,"pqr" , "stu" ,  "vwx" ,  "yz" };
        //creating a array of string to solve

        int digit = up.charAt(0) - '0';
        ArrayList<String> listin = new ArrayList<>();

        String letters = map[digit];
        //access the values directly

        for (int i = 0 ; i < letters.length() ; i++ ) {
            char ch = letters.charAt(i);

            listin.addAll(addin(p+ch , up.substring(1)));

        }
        return listin;
    }

}
