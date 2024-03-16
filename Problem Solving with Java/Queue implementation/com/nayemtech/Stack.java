package com.nayemtech;

public class Stack {
    Node curNode;
    int size;

    public Stack() {
        curNode = null;
        size = 0;
    }

    public void push(int element) {
        Node newNode = new Node(element);
        newNode.next = curNode;
        curNode = newNode;
        size++;
    }

    public int pop() {
        int poppedValue = curNode.val;
        curNode = curNode.next;
        size--;
        return poppedValue;
    }

    public int top() {
        return curNode.val;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
