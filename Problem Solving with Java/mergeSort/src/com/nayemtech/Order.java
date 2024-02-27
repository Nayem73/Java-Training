package com.nayemtech;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Book> booksOrdered = new ArrayList<>();
    private Customer customer;
    private double totalPaid;
    private boolean isPaid;

    public Order(List<Book> booksOrdered, Customer customer, double totalPaid, boolean isPaid) {
        this.booksOrdered = booksOrdered;
        this.customer = customer;
        this.totalPaid = totalPaid;
        this.isPaid = isPaid;
    }

    public List<Book> getBooksOrdered() {
        return booksOrdered;
    }

    public void setBooksOrdered(List<Book> booksOrdered) {
        this.booksOrdered = booksOrdered;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}
