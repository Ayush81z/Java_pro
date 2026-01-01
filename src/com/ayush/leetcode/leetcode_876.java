package com.ayush.leetcode;


public class leetcode_876 {
    public Node middleNode(Node head) {
        if ( head == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;

        while ( fast != null && fast.next != null && fast.next.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if ( fast .next == null) {
            return slow;
        }
        return slow.next;


    }
}


//   class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }


