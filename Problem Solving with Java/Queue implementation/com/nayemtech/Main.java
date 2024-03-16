package com.nayemtech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println("pres 1 to push");
        System.out.println("pres 2 to pop");
        System.out.println("pres 3 to get top element");
        System.out.println("pres 4 to get queue size");
        System.out.println("pres 5 to get isEmpty()");
        System.out.println("pres 0 to exit");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input = scanner.nextInt();
            if (input == 1) {
                int val = scanner.nextInt();
                q.push(val);
            } else if (input == 2) {
                q.pop();
            } else if (input == 3) {
                System.out.println(q.front());
            } else if (input == 4) {
                System.out.println(q.size());
            } else if (input == 5) {
                System.out.println(q.isEmpty());
            } else {
                break;
            }
        }
    }
}