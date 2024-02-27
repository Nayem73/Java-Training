package com.nayemtech;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Book> books = new ArrayList<>();

    public Inventory() {
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public boolean isAvailable(Book book) {
        if (books.contains(book)) {
            return true;
        }
        return false;
    }
}
