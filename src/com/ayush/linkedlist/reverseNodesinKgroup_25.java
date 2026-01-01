package com.ayush.linkedlist;

class reverseNodesinKgroup_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        while ( true) {
            ListNode newlast = current;
            ListNode last = prev;
            ListNode next = current.next;
            if (!hasNodes(current , k)) {
                break;
            } //check for the k nodes if available then reverse or else just exit and return the node

            for (int i = 0 ; current != null && i < k ; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if ( next != null) {
                    next = next.next;
                }
            }

            if ( last != null) {
                last.next = prev;
            }
            else {
                head = prev;
            }
            newlast.next = current;
            if (current == null) {
                break;
            }
            prev = newlast;
        }
        return head;
    }

    public boolean hasNodes(ListNode node , int k) {
        int count = 0;
        while (node != null && count < k) {   //only exits on count == k
            node = node.next;
            count++;
        }
        return count ==k;
    }
}
