package com.ayush.linkedlist;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static void main(String[] args) {
        // Number 1: 2 -> 4 -> 3  (342)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Number 2: 5 -> 6 -> 4  (465)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);

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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum/10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
        }
        return dummy.next;
    }

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode temp_head = new ListNode(0);
//        ListNode l3 = temp_head;
//        int carry = 0;
//
//        while (l1 != null || l2 != null) { //if one list is null then it will contribute 0 atlleast
//            int l1_val = (l1 != null) ? l1.val : 0; //values being assigned
//            int l2_val = (l2 != null) ? l2.val : 0;
//
//            int current_total = l1_val + l2_val + carry;
//            carry = current_total / 10;
//            int lastdigit = current_total %10;
//
//            ListNode new_node = new ListNode(lastdigit);
//            l3.next = new_node;  //to declare that l3.next is not null
//
//            if (l1 != null) l1 = l1.next;
//            if (l2 != null) l2 = l2.next;
//
//            l3 = l3.next;
//        }
//
//        if (carry > 0 ) {
//            ListNode new_node = new ListNode(carry); //to create a extra digit holder for the carry
//            l3.next = new_node;
//            l3 = l3.next;
//        }
//
//        return temp_head.next;
//
//    }


}
