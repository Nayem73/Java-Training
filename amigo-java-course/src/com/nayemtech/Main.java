package com.nayemtech;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
       Box<Phone> box = new Box<>();
       box.setT(new Phone("Realme"));
       System.out.println(box.getT());

       Box<Letter> letterBox = new Box<>();
       letterBox.setT(new Letter("Karim vai", LocalDateTime.now(), 46));
        System.out.println(letterBox.getT());
    }
}