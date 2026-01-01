package com.ayush.linkedlist;

public class circularLL {
    private Node head;
    private Node tail;

    public void insert(int value) {
        Node node = new Node(value);

        node.next = head;
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.value + "->");
                node = node.next;
            } while (node != head);
            System.out.println("HEAD");
        }


    }






    private class Node {
        private int value;
        private circularLL.Node next;

        //if you wanna insert at first or last using head and tail
        public Node(int value) {
            this.value = value;
        }

        //if you wanna insert at a particular index using the Node next
        public Node (int value, circularLL.Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
