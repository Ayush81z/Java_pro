package com.ayush.linkedlist;

import com.ayush.leetcode.Leetcode33;

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
    public static void main(String[] args) {
        leetcode_61 sol = new leetcode_61();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        ListNode result = sol.rotateRight(head, k);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    //two pointer approach
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        ListNode L1 = head;
        ListNode L2 = head;
        int length = 1;

        while (L2.next != null) {
            L2 = L2.next;
            length++;
        }

        k = k % length;

        while(k > 0) {
            L1 = head;
            while (L1.next != L2) {
                L1 = L1.next;
            }
            L1.next = null;
            L2.next = head;
            head = L2;

            L2 = L1;
            k--;
        }
        return head;
    }


//    class Solution {
//        public ListNode rotateRight(ListNode head, int k) {
//            if (k <= 0 || head == null || head.next == null) {
//                return head;
//            }
//
//            ListNode last = head;
//            int length = 1;
//
//            while (last.next != null) {  //reach end
//                last = last.next;
//                length++;
//            }
//
//            last.next = head;
//            int rotation = k%length;  //to control  the negative notion
//            int skip = length-rotation;
//            ListNode lastend = head;
//            for ( int i = 0 ; i< skip-1 ; i++) { //skip until the required end
//                lastend = lastend.next;
//            }
//            head = lastend.next;
//            lastend.next = null;
//
//            return head;
//        }
//    }
}
