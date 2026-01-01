package com.ayush.leetcode;



   class Node {
      int val;
      Node next;
      Node() {}
      Node(int val) { this.val = val; }
      Node(int val, Node next) { this.val = val; this.next = next; }
  }

public class leetcode_21 {
    public Node mergeTwoLists(Node list1, Node list2) {
        Node head = new Node();
        Node tail = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;

            }
            else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }

        tail.next = (list1 != null) ? list1 : list2;
        //if the first list is not null then take list1 or list2
        return head.next;

    }
}
