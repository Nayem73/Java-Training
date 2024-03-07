package com.nayemtech;

import javax.swing.plaf.IconUIResource;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1 for push
        //2 for pop
        //3 for top
        //4 for size
        //0 for exit

        Node head = null;
        Node prevN = null;
        Scanner scanner = new Scanner(System.in);
        int stackSize = 0;
        while (true) {
            int operation = scanner.nextInt();
            if (operation == 1) {
                int insertValue = scanner.nextInt();
                if (head == null) {
                    head = new Node(insertValue);
                    prevN = head;
                } else {
                    prevN.next = new Node(insertValue);
                    prevN.next.prev = prevN;
                    prevN = prevN.next;
                }
                stackSize++;
            } else if (operation == 2) {
                if (stackSize == 0) {
                    System.out.println("stack is empty!");
                } else {
                    prevN = prevN.prev;
                    stackSize--;
                }
            } else if (operation == 3) {
                if (stackSize == 0) {
                    System.out.println("stack is empty!");
                } else {
                    System.out.println("top = " + prevN.val);
                }
            } else if (operation == 4) {
                System.out.println("stack size is = " + stackSize);
            } else if (operation == 0) {
                break;
            }
        }
    }
}