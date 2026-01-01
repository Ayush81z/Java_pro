package com.ayush.linkedlist;

public class main2 {
    public static void main(String[] args) {
        doubleLL list = new doubleLL();
        list.insertfir(5);
        list.insertfir(17);
        list.insertfir(58);
        list.insertfir(14);

        list.insertlast(12);

        list.insert(90,2);

        list.display();
        list.displayrev();

//        circularLL list = new circularLL();
//        list.insert(3);
//        list.insert(5);
//        list.insert(2);
//        list.insert(9);
//
//        list.display();




    }

}
