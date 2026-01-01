package com.ayush.recursion;

public class string_stream {
    public static void main(String[] args) {
//        String processed = " ";
//        String unprocessed = "bcaapoai";
//        remove(processed,unprocessed);


//        System.out.println(remove2("bcoopawoa"));


        System.out.println(remove3("bccoapplekoawdj"));
    }

    //method one : without return value
//    static void remove(String p ,String up){
//        if (up.isEmpty()) {
//            System.out.println("processed string : "+ p);
//            return;
//        }
//        char ch = up.charAt(0);
//
//        if (ch == 'a') {
//            remove(p,up.substring(1));
//            //pop out the charcter at the first index if it matches the condn
//        }
//        else {
//            remove(p+ch,up.substring(1));
//            //pop out the character even if the codn is not met so that we can itterate the next character by adding the up to p string
//        }
//
//    }


    //method 2 : (with return value)
//    static String remove2(String up){
//        if (up.isEmpty()) {
//            return "";
//        }
//        char ch = up.charAt(0);
//
//        if (ch == 'a') {
//            return remove2(up.substring(1));
//
//        }
//        else {
//            return ch + remove2(up.substring(1));
//
//        }
//
//    }


    //if you want to remove a word from a big string

    static String remove3(String up){
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return remove3(up.substring(5));

        }
        else {
            return up.charAt(0) + remove3(up.substring(1));
        }
        //up.charAt(0) → Gets the first character (e.g., 'b' in "bapple")
        //up.substring(1) → Gives the rest of the string (e.g., "apple")
        //Then you recursively call remove3() on the rest

    }


}
