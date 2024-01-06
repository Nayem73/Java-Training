package com.nayemtech;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String a = "321.555-4321";
        String b = "321-555.4321";
        String c = "39.3";
        String d = "321.555.4321";
        String e = "CoreyMSchafer@gmail.com";

        System.out.println(isValid(e));
    }

    public static boolean isValid(String inputString) {
        String pattern = "[a-zA-Z0-9.-_]+@[a-zA-Z-]+\\.[a-zA-Z]+";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(inputString);
        return matcher.matches();
    }
}