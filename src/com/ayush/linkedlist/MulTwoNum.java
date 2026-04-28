package com.ayush.linkedlist;

//https://www.geeksforgeeks.org/dsa/multiply-two-numbers-represented-linked-lists/

public class MulTwoNum {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static long mod = 1000000007;
    public static long multiplyTwoLists(Node first, Node second) {
        long val1 = 0;
        long val2 = 0;

        while (first != null || second != null) {
            if (first != null) {
                val1 = ((val1 * 10) + first.data) % mod;
                first = first.next;
            }

            if (second != null) {
                val2 = ((val2 * 10) + second.data) % mod;
                second = second.next;
            }
        }

        return (val1 * val2) % mod;
    }

    static void printList(Node curr) {
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String args[]) {

        // create first list 9->4->6
        Node head1 = new Node(9);
        head1.next = new Node(4);
        head1.next.next = new Node(6);

        // create second list 8->4
        Node head2 = new Node(8);
        head2.next = new Node(4);
        System.out.println(multiplyTwoLists(head1, head2));
    }

}
