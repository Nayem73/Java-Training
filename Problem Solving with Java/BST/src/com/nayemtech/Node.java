package com.nayemtech;

public class Node {
    int val;
    Node left;
    Node right;
    Node par;
    Node(int X) {
        this.val = X;
        this.left = null;
        this.right = null;
        this.par = null;
    }
}