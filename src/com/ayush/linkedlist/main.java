package com.ayush.linkedlist;

public class main {
    public static void main(String[] args) {
        singleLL list = new singleLL();
        list.insertfirst(3);
        list.insertfirst(5);
        list.insertfirst(9);
        list.insertfirst(7);

        list.insertlast(45);

        list.insert(69, 4);

        list.display();
        System.out.println(" ");

        System.out.println("the first value to be deleted is :"+list.deletefirst());

        System.out.println("the last value to be deleted is :"+list.deletelast());

        list.display();
        System.out.println(" ");

        System.out.println("the  value to be deleted is :"+list.delete(2));

        list.display();

        System.out.println(" ");

        System.out.println(list.find(5));



    }
}
