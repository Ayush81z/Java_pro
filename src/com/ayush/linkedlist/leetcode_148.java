//package com.ayush.leetcode;
//
//
//
//public class leetcode_148 {
//    public ListNode sortList(ListNode head) {
//
//        if ( head == null || head.next == null ) {
//            return head;
//        }
//
//        ListNode mid = middleNode(head);
//        ListNode left = sortList(head);
//        ListNode right = sortList(mid);
//
//        return merge(left , right);
//    }
//
//
//    public ListNode merge ( ListNode list1 , ListNode list2) {
//        ListNode head = new ListNode();
//        ListNode tail = head;
//        while (list1 != null && list2 != null) {
//            if ( list1.val <  list2.val) {
//                tail.next = list1;
//                list1 = list1.next;
//                tail = tail.next;
//            }
//            else {
//                tail.next = list2;
//                list2 = list2.next;
//                tail = tail.next;
//            }
//        }
//        tail.next = (list1 != null) ? list1 : list2;
//        return head.next;
//    }
//
//    public ListNode middleNode(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while ( fast.next != null && fast.next.next != null ) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        ListNode mid = slow.next;  //after mid we need value so slightly changed
//        slow.next = null;
//        return mid;
//    }
//
//}
//
////public class ListNode {
////    int val;
////    ListNode next;
////    ListNode() {}
////    ListNode(int val) { this.val = val; }
////    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
////}
//


//method 2 via bubble sort

//private void bubbleSort(int row, int col) {
//    if (row == 0) {
//        return;
//    }
//
//    if (col < row) {
//        Node first = get(col); // gets the node directly
//        Node second = get(col + 1);
//
//        if (first.value > second.value) {
//            // swap
//            //front to back implementation swicthes in between if smaller found
//            if (first == head) {
//                head = second;
//                first.next = second.next;
//                second.next = first;
//            } else if (second == tail) {
//                Node prev = get(col - 1);
//                prev.next = second;
//                tail = first;
//                first.next = null;
//                second.next = tail;
//            } else {
//                Node prev = get(col - 1);
//                prev.next = second;
//                first.next = second.next;
//                second.next = first;
//            }
//        }
//        bubbleSort(row, col + 1);
//    } else {
//        bubbleSort(row - 1, 0);
//    }
//}