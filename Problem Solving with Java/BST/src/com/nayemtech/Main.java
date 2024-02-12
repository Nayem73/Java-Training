package com.nayemtech;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void inorderTraverse(Node curNode) {
        if (curNode == null) return;
        inorderTraverse(curNode.left);
        System.out.print(curNode.val + " ");
        inorderTraverse(curNode.right);
    }
    static Node createBST(Node root, Node node) {
        if (root == null) {
            root = node;
            return node;
        }
        Node curNode = root;
        Node parNode = null;
        while (curNode != null) {
            parNode = curNode;
            if (node.val < curNode.val) {
                curNode = curNode.left;
            } else {
                curNode = curNode.right;
            }
        }

        if (node.val < parNode.val) {
            parNode.left = node;
            node.par = parNode;
        } else {
            parNode.right = node;
            node.par = parNode;
        }
        return root;
    }

    static Node BSTTransplant(Node root, Node curNode, Node newNode) {
        if (curNode == root) {
            root = newNode;
        } else if (curNode == curNode.par.left) {
            newNode.par = curNode.par;
            curNode.par.left = newNode;
        } else if (curNode == curNode.par.right) {
            newNode.par = curNode.par;
            curNode.par.right = newNode;
        }
        return root;
    }

    static Node BSTDelete(Node root, Node node) {
        if (node.left == null) {
            root = BSTTransplant(root, node, node.right);
        } else if (node.right == null) {
            root = BSTTransplant(root, node, node.left);
        } else {
            Node curNode = root.right;
            Node smallestNode = curNode;
            while (curNode != null) {
                smallestNode = curNode;
                curNode = curNode.left;
            }

            if (smallestNode.par != node) {
                root = BSTTransplant(root, smallestNode, smallestNode.right);
                smallestNode.right = node.right;
                smallestNode.right.par = smallestNode;
            }
            root = BSTTransplant(root, node, smallestNode);
            smallestNode.left = node.left;
            smallestNode.left.par = smallestNode;
        }
        return root;
    }

    static Node BSTFind(Node root, int val) {
        Node curNode = root;
        while (curNode != null) {
            if (curNode.val == val) {
                return curNode;
            } else if (val < curNode.val) {
                curNode = curNode.left;
            } else {
                curNode = curNode.right;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Integer> store = new ArrayList<>(List.of(10,5,17,3,7,12,19,1,4,13));
        Node root = null;

        for (int i = 0; i < store.size(); i++) {
            Node node = new Node(store.get(i));
            root = createBST(root, node);
        }

        inorderTraverse(root);
        System.out.println();

        Node nodeWith10 = BSTFind(root, 10);
        if (nodeWith10 != null) {
            root = BSTDelete(root, nodeWith10);
        }
        inorderTraverse(root);
    }

}