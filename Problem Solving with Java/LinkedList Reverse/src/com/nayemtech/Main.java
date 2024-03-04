package com.nayemtech;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> nodesValue = new ArrayList<>(List.of(5,2,4,3,1,0));
        Node head = new Node(nodesValue.get(0));
        Node curNode = null;
        Node prevNode = head;

        for (int i = 1; i < nodesValue.size(); i++) {
            curNode = new Node(nodesValue.get(i));
            prevNode.next = curNode;
            prevNode = curNode;
        }

        curNode = head;
        while (curNode != null) {
            System.out.print(curNode.val + " ");
            curNode = curNode.next;
        }

        curNode = head;
        prevNode = null;
        while (curNode != null) {
            if (curNode.next == null) head = curNode;
            Node nextNode = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
        }

        System.out.println();
        curNode = head;
        while (curNode != null) {
            System.out.print(curNode.val + " ");
            curNode = curNode.next;
        }
    }
}