package com.ayush.linkedlist;

class leetcode_143 {
    public void reorderList(ListNode head) {
        ListNode mid = mid(head);
        ListNode sn = head;
        ListNode mn = reverseList(mid);

        while (sn != null && mn != null) {
            ListNode temp = sn.next;
            sn.next = mn;
            sn = temp; //takes the original value from the list

            temp = mn.next;
            mn.next = sn;
            mn = temp;
        }
        if (sn != null) {
            sn.next = null;
        }
    }

    public ListNode reverseList(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode mid (ListNode node) {
        if (node == null) {
            return node;
        }
        ListNode slow = node;
        ListNode fast = node;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        return mid;
    }
}
