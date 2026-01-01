package com.ayush.collection;

public class example {
    enum week {
        monday , tuesday , wednesday , thrusday , friday , saturday , sunday;
        //these are enum constant
        //type is week


        week() {
            System.out.println(this);
        }
        //this is not public or protected
        //this is not a enum concept

    }

    public static void main(String[] args) {
        week day;
        day = week.monday;

        System.out.println(day);
    }
}
