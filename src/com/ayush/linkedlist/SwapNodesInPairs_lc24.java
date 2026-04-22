package com.ayush.linkedlist;

public class SwapNodesInPairs_lc24 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
        this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        SwapNodesInPairs_lc24 sol = new SwapNodesInPairs_lc24();
        ListNode result = sol.swapPairs(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;

        ListNode temp = new ListNode(0); //using dummy node
        temp.next = head;
        ListNode current = temp;

        while (current.next != null && current.next.next != null) {
            ListNode firstNode = current.next;
            ListNode secondNode = current.next.next;
            firstNode.next = secondNode.next;
            current.next = secondNode;
            current.next.next = firstNode;
            current = current.next.next;
        }
        return temp.next;
    }
}
