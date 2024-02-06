package com.nayemtech;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Bangla", "authorBangla", 250, 4);
        Book book2 = new Book(2, "English", "authorEnglish", 155, 18);
        Book book3 = new Book(3, "Math", "authorMath", 230, 7);
        Book book4 = new Book(4, "Science", "authorScience", 330, 3);
        Book book5 = new Book(5, "History", "authorHistory", 500, 2);

        Customer customer1 = new Customer(1, "Rony", "rony@gmail.com", "Tongi, Dhaka");
        Customer customer2 = new Customer(1, "Einstein", "Einstein@gmail.com", "3/4 West Scotland Yard, London, England");
        Customer customer3 = new Customer(1, "Nayem", "nayem73@gmail.com", "7/5 West Vashantek, Dhaka Cantonment, Dhaka 1206");

        Inventory inventory = new Inventory();
        inventory.addBook(book5);
        inventory.addBook(book4);
        inventory.addBook(book2);

        for (Book book : inventory.getBooks()) {
            System.out.println(book.getTitle());
        }
        System.out.println();

        List<Book> booksOrdered = new ArrayList<>();
        if (inventory.isAvailable(book5)) {
            booksOrdered.add(book5);
        } else {
            System.out.println(book5.getTitle() + " with id " + book5.getId() + " is not available in book inventory! please try another book");
        }

        if (inventory.isAvailable(book1)) {
            booksOrdered.add(book1);
        } else {
            System.out.println(book1.getTitle() + " with id " + book1.getId() + " is not available in book inventory! please try another book");
        }

        if (inventory.isAvailable(book2)) {
            booksOrdered.add(book2);
        } else {
            System.out.println(book2.getTitle() + " with id " + book2.getId() + " is not available in book inventory! please try another book");
        }

        Order order1 = new Order(booksOrdered, customer3, 450, false);
        for (Book book : order1.getBooksOrdered()) {
            System.out.println(book.getId() + " "+ book.getTitle() + " " + book.getPrice() + " " + book.getQuantity());
        }

        

    }
}