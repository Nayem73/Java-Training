package com.nayemtech;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);

        int i = 0;
        while (i < numbers.size()) {
            System.out.println(numbers.get(i));
            numbers.add(15);
            i++;
        }
    }
}