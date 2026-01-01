package com.ayush.linkedlist;

public class doubleLL {
    private Node head;
    private Node tail;


    public void insertfir(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = node;
        }
    }

    public void insertlast(int value) {
        if (head == null) {
            insertfir(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public Node behindindex (int index) {
        Node p = head;
        for (int i = 1; i < index; i++) {
            p = p.next;
        }
        return p;
    }

    public void insert(int value , int index) {
        if (head == null) {
            insertfir(value);
            return;
        }
        if (tail == null) {
            insertlast(value);
            return;
        }

        Node node = new Node(value);
        Node p = behindindex(index);

        node.next =p.next;
        p.next = node;
        node.prev = p;
        if (node.next.prev != null) {
            node.next.prev = node;
        }

    }

    public void display() {
        Node node = head;

        while(node!=null) {
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println("END");

    }

    public void displayrev() {
        Node node = tail;

        while(node!=null) {
            System.out.print(node.value + "->");
            node = node.prev;
        }
        System.out.println("START");

    }

    private class Node {
        int value;
        Node next;
        Node prev;


        public  Node(int value) {
            this.value = value;
        }

        public  Node(int value, Node next , Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

}
