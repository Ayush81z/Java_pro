package com.ayush.linkedlist;
//https://www.geeksforgeeks.org/dsa/detect-and-remove-loop-in-a-linked-list/

public class removeLoopinLL {
    static class Node
    {
        int data;
        Node next;
        Node(int data) { this.data = data; }

    }
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create nodes
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;

        n4.next = head;

        // Remove loop
        removeLoop(head);

        // Print result
        printList(head);
    }


    public static void removeLoop(Node head) {
        Node slow = head;
        Node fast = head;
        Node start = null;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        //to increase the efficiency we could have checked for next value also and the fast would be the prev value before the meet point which would also be the last point of the node through which we can make it null
            if (fast == slow) {
                slow = head;
                while (fast != slow) {
                    slow = slow.next;
                    fast = fast.next;
                }
                start = slow;
                break;
            }
        }

        if (start  == null) return;

        Node temp = start;
        while (temp.next != start) {
            temp = temp.next;
        }
        temp.next = null;
    }
}
