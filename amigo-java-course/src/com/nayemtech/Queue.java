package com.nayemtech;

public class Queue {
    private Node curNode;
    private Node head;
    private int size;

    public Integer front() {
        if (head != null) {
            return head.val;
        }
        return null;
    }

    public void push(int val) {
        size++;
        if (head == null) {
            head = new Node(val);
            curNode = head;
        } else {
            Node nextNode = new Node(val);
            curNode.next = nextNode;
            curNode = nextNode;
        }
    }

    public void pop() {
        if (head != null) {
            head = head.next;
            size--;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
