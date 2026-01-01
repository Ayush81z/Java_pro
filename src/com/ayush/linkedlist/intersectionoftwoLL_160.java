package com.ayush.linkedlist;

public class intersectionoftwoLL_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            if (a == null) {
                a = headB;   //connect it back to the head of second node so both traverse equally before they meet at the intersection
            }
            else {
                a = a.next;
            }

            if (b == null) {
                b = headA;
            }
            else {
                b = b.next;
            }
        }
        return a;
    }
}
