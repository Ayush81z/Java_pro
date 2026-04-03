package com.ayush.linkedlist;

public class leetcode_234 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {

      }
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }
    }

        public boolean isPalindrome(ListNode head) {
            if (head == null) {
                return true;
            }
            ListNode mid = mid(head);
            ListNode second = reverse(mid.next);
            mid.next = null; //fr the split

            ListNode first = head;

            while(second != null) {
                if (first.val != second.val) {
                   return false;
                }
                first = first.next;
                second = second.next;
            }
            return true;
        }

        public ListNode reverse(ListNode node) {
             ListNode current = node;
             ListNode prev = null;

            while (current != null) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
        }

        public ListNode mid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        }



    public static void main(String[] args) {
        leetcode_234 sol = new leetcode_234();

        // Example 1: Palindrome list [1, 2, 2, 1]
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(1);
        System.out.println("Is palindrome? " + sol.isPalindrome(head1)); // true

        // Example 2: Non-palindrome list [1, 2, 3]
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        System.out.println("Is palindrome? " + sol.isPalindrome(head2)); // false
    }
}
