package com.ayush.oops;

import com.ayush.oops.accessmodifier;

public class accessmodifiers2 {
    public static void main(String[] args) {

        // cannot access it without the psvm
        accessmodifier az = new accessmodifier();
        az.setPasswords("tepzoid42");
        System.out.println("Password set successfully!");
        System.out.println(az.getPasswords());

        System.out.println(" ");


        az.setPasswords("lesotho234");
        System.out.println("overwrote the password ");
        System.out.println(az.getPasswords());
    }
}
