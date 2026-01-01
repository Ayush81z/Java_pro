package com.ayush.linkedlist;

public class leetcode__92 {

        public static void main(String[] args) {
            // Build linked list: 1 -> 2 -> 3 -> 4 -> 5
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            // Create Solution object
            leetcode__92 sol = new leetcode__92();

            // Call reverseBetween with left = 2, right = 4
            ListNode result = sol.reverseBetween(head, 2, 4);

            // Print the resulting list
            printList(result);
        }

        // Helper function to print linked list
        public static void printList(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val);
                if (current.next != null) {
                    System.out.print(" -> ");
                }
                current = current.next;
            }
            System.out.println();
        }


    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

        public ListNode reverseBetween(ListNode head, int left, int right) {
            if ( left == right) {
                return head;
            }

            ListNode current = head;
            ListNode prev = null;

            for ( int i = 0 ; current != null && i < left-1 ; i++) {
                prev = current;
                current = current.next;
            }
            //prev is updated with the current value before left


            ListNode newlast = current; //new last of the reversed set
            ListNode last = prev; // last node of the before the reversed set

            ListNode next = current.next;
            for (int i = 0 ; current != null && i < right-left + 1 ; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if ( next != null) {
                    next = next.next;
                }

            }

            if ( last != null) {
                last.next = prev;
            }
            else {
                head = prev;
            }

            newlast.next = current;
            return head;
        }
    }


