package com.ayush.linkedlist;

public class removeElementLL_203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode temphead = new ListNode(-1); //like the dummy head method
        temphead.next = head;

        ListNode curr = temphead;

        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return temphead.next;
    }
}
