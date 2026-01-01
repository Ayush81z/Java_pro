package com.ayush.linkedlist;

class deletethemiddleofLL_2095 {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode mid = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = mid;  //gets the prev of mid
            mid = mid.next; //slow pointer to get the mid

        }

        prev.next = mid.next;
        mid.next = null;

        return head;

    }

}
