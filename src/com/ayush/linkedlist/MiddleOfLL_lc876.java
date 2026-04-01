package com.ayush.linkedlist;

public class MiddleOfLL_lc876 {
    public ListNode middleNode(ListNode head) {
        if ( head == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        //fast and slow pointers
        while ( fast != null && fast.next != null && fast.next.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if ( fast .next == null) { //for every other case
            return slow;
        }
        return slow.next; //when the length is even
    }
}
