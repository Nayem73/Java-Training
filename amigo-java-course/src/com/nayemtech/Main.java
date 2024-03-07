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

        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int operation = scanner.nextInt();
            if (operation == 1) {
                int insertValue = scanner.nextInt();
                stack.push(insertValue);
            } else if (operation == 2) {
                if (stack.isEmpty()) System.out.println("stack is empty!");
                else {
                    int poppedValue = stack.pop();
                    System.out.println(poppedValue + " is popped");
                }
            } else if (operation == 3) {
                if (stack.isEmpty()) System.out.println("stack is empty!");
                else System.out.println(stack.top());
            } else if (operation == 4) {
                System.out.println(stack.size());
            } else if (operation == 0) {
                break;
            }
        }
    }
}