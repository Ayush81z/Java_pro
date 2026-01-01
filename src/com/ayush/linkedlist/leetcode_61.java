package com.ayush.linkedlist;

public class leetcode_61 {
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
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if (k <= 0 || head == null || head.next == null) {
                return head;
            }

            ListNode last = head;
            int length = 1;

            while (last.next != null) {  //reach end
                last = last.next;
                length++;
            }

            last.next = head;
            int rotation = k%length;  //to control  the negative notion
            int skip = length-rotation;
            ListNode lastend = head;
            for ( int i = 0 ; i< skip-1 ; i++) { //skip until the required end
                lastend = lastend.next;
            }
            head = lastend.next;
            lastend.next = null;

            return head;
        }
    }
}
