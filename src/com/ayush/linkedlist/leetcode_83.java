package com.ayush.linkedlist;

public class leetcode_83 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                    node.next = node.next.next;
                    //skipping value if equal in the next itteration
            }
            else {
                node = node.next;
            }
        }
        return head;
    }

    //using two pointer on revisit
//    public static ListNode deleteDuplicates(ListNode head) {
//
//        ListNode slow = head;
//        ListNode fast = head.next;
//
//        while (fast!= null ) {
//            if (slow.val == fast.val) {
//                slow.next = fast.next;
//                fast = fast.next;
//            }
//            else {
//                slow = slow.next;
//                fast = fast.next;
//            }
//        }
//        return head;
//    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() { }
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode result = deleteDuplicates(head);

        // Print the resulting linked list
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
        System.out.println();
    }
}
