package com.ayush.linkedlist;

import java.util.*;

class LRUcache_lc146 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode prev;
        int key;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int key , int val) { this.key = key; this.val = val; }
        ListNode(int val,ListNode prev , ListNode next) { this.val = val; this.prev = prev; this.next = next;  }
    }

    public final int capacity;
    public HashMap<Integer, ListNode> cache = new HashMap<>();
    ListNode head;
    ListNode tail;

    public LRUcache_lc146(int capacity) {
        this.capacity = capacity;
        head =  new ListNode(0,0);
        tail = new ListNode(0,0);
        head.next = tail;
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
            ListNode node = cache.get(key);
            node.val = value;
            delete(node);
            insertAttop(node);
        } else {
            ListNode node = new ListNode(key,value);
            cache.put(key,node);
            insertAttop(node);

            if (cache.size() > capacity) {
                cache.remove(tail.prev.key);
                delete(tail.prev);
            }
        }
    }

    public void delete (ListNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void insertAttop(ListNode node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
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

