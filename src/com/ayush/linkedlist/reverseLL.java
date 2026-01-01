package com.ayush.linkedlist;

public class reverseLL {
    // recursion reverse
//    private void reverse(Node node) {
//        if (node == tail) {
//            head = tail;
//            return;
//        }
//        reverse(node.next);
//        tail.next = node;
//        tail = node;
//        tail.next = null;
//    }



    //non recursion reverse
//    public ListNode reverseList(ListNode node) {
//        ListNode prev = null;
//        ListNode curr = node;
//
//        while (curr != null) {
//            ListNode next = curr.next;
//            curr.next = prev; //links the list backwards which makes the reversal successfull
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//    }


}
