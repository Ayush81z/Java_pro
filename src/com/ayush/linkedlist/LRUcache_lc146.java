package com.ayush.linkedlist;

import java.util.*;

class LRUcache_lc146 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode prev;
        int key;
        ListNode(int key , int val) { this.key = key; this.val = val; }
    }

    public final int capacity;
    public HashMap<Integer, ListNode> cache = new HashMap<>();
    ListNode head;
    ListNode tail;

    public LRUcache_lc146(int capacity) {
        this.capacity = capacity;
        head =  new ListNode(0,0);
        tail = new ListNode(0,0);
        head.next = tail;  //need to be mentioned for the logic to start working
        tail.prev = head;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            ListNode node = cache.get(key);
            delete(node);
            insertAttop(node);
            return node.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            ListNode node = cache.get(key); //get the current key's pair on the node
            node.val = value; //now update the value
            delete(node);
            insertAttop(node);
        } else {
            ListNode node = new ListNode(key,value); //insert  a new value into the node
            cache.put(key,node); //to main synchronous between the DLL and Maps
            insertAttop(node);

            if (cache.size() > capacity) {
                cache.remove(tail.prev.key);
                delete(tail.prev);
            }
        }
    }

    public void delete (ListNode node) {
        node.prev.next = node.next; //normal mapping the prev and next
        node.next.prev = node.prev;
    }

    public void insertAttop(ListNode node) {
        node.next = head.next; //place just after the head by camouflage between the nodes
        node.prev = head;

        node.next.prev = node; //mapping from the next element
        head.next = node;
    }

    public static void main(String[] args) {

        LRUcache_lc146 lru = new LRUcache_lc146(2);

        lru.put(1, 1);
        lru.put(2, 2);

        System.out.println(lru.get(1)); // 1

        lru.put(3, 3);

        System.out.println(lru.get(2)); // -1

        lru.put(4, 4);

        System.out.println(lru.get(1)); // -1
        System.out.println(lru.get(3)); // 3
        System.out.println(lru.get(4)); // 4
    }


}

