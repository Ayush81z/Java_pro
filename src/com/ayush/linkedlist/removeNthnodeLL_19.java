package com.ayush.linkedlist;

class removeNthnodeLL_19 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        for (int i = 0 ; i <= n ; i++) {
            fast = fast.next;
        }

        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode rev = reverse(head);
//        ListNode temp = rev;
//        ListNode prev = null;
//        for (int i= 1 ; i < n ; i++) {
//            prev = temp;
//            temp = temp.next; }
//        if (prev != null) {
//            prev.next = temp.next;
//        }
//        else {
//            rev = rev.next;
//        }
//        return reverse(rev);
//    }
//
//    public ListNode reverse(ListNode head) {
//        ListNode prev = null;
//        ListNode curr = head;
//        while (curr != null) {
//            ListNode next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//    }

}
