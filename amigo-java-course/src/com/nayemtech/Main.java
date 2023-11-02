package com.nayemtech;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>(5); // Declare a list of Integer and initialize with size 5

        // Add elements to the list
        s.add(2);
        s.add(4);
        s.add(6);
        s.add(8);
        s.add(10);

        for (int i = 0; i < s.size(); i++) {
            if (s.get(i) == 4) {
                System.out.println(i);
            } else {
                System.out.println(i + " " + s.get(i));
            }
        }

        System.out.println(s); // Print the contents of the list
    }
}
