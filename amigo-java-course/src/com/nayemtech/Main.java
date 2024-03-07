package com.nayemtech;

import javax.swing.plaf.IconUIResource;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Customer customer1 = new Customer(3, "Nayem");
       Customer customer2 = new Customer(3, "Nayem");

       Set<Customer> st = new HashSet<>();
       st.add(customer1);
       st.add(customer2);

        System.out.println(customer1 == customer2);
        System.out.println(customer1.equals(customer2));

        String s1 = new String("ok");
        String s2 = new String("ok");

        System.out.println("string: " + (s1 == s2));
    }
}