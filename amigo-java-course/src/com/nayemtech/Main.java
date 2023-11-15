package com.nayemtech;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/tmp.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
    }
}