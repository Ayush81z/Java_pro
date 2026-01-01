package com.ayush.linkedlist;

public class singleLL {
    private Node head;
    private Node tail;
    private int size;


    singleLL() {
        this.size = 0;
    }

    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;//swapping of values
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertlast(int val){
        Node node = new Node(val);

        if (tail == null) {
            insertfirst(val);
            return;
        }
        tail.next = node; //swapping of values
        tail = node;
        size++;

    }


    public void insert(int val, int index) {
        if (tail == null){
            insertfirst(val);
            return;
        }

        if (index == size) {
            insertlast(val);
            return;
        }

        Node temp = head; //to itterate without changing the position of head
        for (int i = 1; i < index; i++) {
            temp =temp.next; //itterates throughout the list
        }

        Node node = new Node(val , temp.next);
        temp.next = node;
        size++;

    }



    public int deletefirst(){
        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    //to get the second last number
    public Node get(int index) {
        Node temp = head;
        for (int i=0; i< index ; i++) {
            temp = temp.next;
        }
        return temp;
    }



    public int deletelast() { //delete any value which is present at the last
        if (size<= 1) {
            return deletefirst();
        }

        Node secondlast = get(size-2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            deletefirst();
        }
        if (index == size-1) {
            deletelast();
        }

        Node node = get(index-1);
        int val = node.next.value;
        node.next = node.next.next;

        return val;
    }

    //to find the index of teh value
    public int find(int value) {
        Node node = head;
        int index = 0;
        //node is basically kind of a index , you to use .value
        while (node != null) {
            if (node.value == value) {
                return index;
            }
            node = node.next;
            index++;
        }
        return -1;
    }


    //middle node
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while ( fast.next != null && fast.next.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;  //after mid we need value so slightly changed
        slow.next = null;
        return mid;
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value +"-->");
            temp = temp.next;
        }
        System.out.print("END");

    }


    private class Node {
        private int value;
        private Node next;

        //if you wanna insert at first or last using head and tail
        public Node(int value) {
            this.value = value;
        }

        //if you wanna insert at a particular index using the Node next
        public Node (int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = get(col); // gets the node directly
            Node second = get(col + 1);

            if (first.value > second.value) {
                // swap
                //front to back implementation swicthes in between if smaller found
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

}
