package com.ayush.linkedlist;

import com.sun.security.auth.UnixNumericGroupPrincipal;

public class LinkedListCycle_lc142 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        head.next.next = head; // cycle at node with value 1

        LinkedListCycle_lc142 sol = new LinkedListCycle_lc142();
        ListNode result = sol.detectCycle(head);

        if (result != null) {
            System.out.println("Cycle starts at node with value: " + result.val);
        } else {
            System.out.println("No cycle");
        }
    }

    //optimal
    public static ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
