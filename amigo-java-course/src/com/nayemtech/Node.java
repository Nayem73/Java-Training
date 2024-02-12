package com.nayemtech;

public class Node {
    int val;
    Node left;
    Node right;
    Node par;
    Node(int X) {
        this(X, null);

        this.val = X;
        this.left = null;
        this.right = null;
        this.par = null;
    }

    Node(int X, Node left) {
        this(null, X);
        this.val = X;
        this.left = left;
    }
    Node(Node left, int X) {
        this.val = X;
        this.left = left;
    }
}