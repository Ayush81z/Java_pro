package com.ayush.linkedlist;

public class evenandodd_328 {
public ListNode oddEvenList(ListNode head) {
    if (head == null) {
        return null;
    }
    ListNode odd = head;
    ListNode even = head.next;
    ListNode evenhead = even;

    while (even != null && even.next != null) {
        odd.next = even.next;
        odd = odd.next;
        even.next = odd.next;
        even = even.next;

    }
    odd.next = evenhead;

    return head;
}
}
