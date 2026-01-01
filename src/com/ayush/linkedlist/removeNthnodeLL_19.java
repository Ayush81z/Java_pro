package com.ayush.linkedlist;

class removeNthnodeLL_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode rev = reverse(head);
        ListNode temp = rev;
        ListNode prev = null;
        for (int i= 1 ; i < n ; i++) {
            prev = temp;
            temp = temp.next; }
        if (prev != null) {
            prev.next = temp.next;
        }
        else {
            rev = rev.next;
        }
        return reverse(rev);
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
