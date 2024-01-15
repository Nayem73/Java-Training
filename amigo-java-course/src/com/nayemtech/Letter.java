package com.nayemtech;

import java.time.LocalDateTime;

public class Letter {
    private String sender;
    private LocalDateTime date;
    private int age;

    public Letter(String sender, LocalDateTime date, int age) {
        this.sender = sender;
        this.date = date;
        this.age = age;
    }

    public Letter() {
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "sender='" + sender + '\'' +
                ", date=" + date +
                ", age=" + age +
                '}';
    }
}
