package com.nayemtech;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var x = 33.55; //var keyword = auto in C++;
        var y = "what";
        var z = 34;

        int[] arr = new int[5];
        Arrays.fill(arr, 23);
        System.out.println(x);
        System.out.println(x + ' ' + y + ' ' + z);
        System.out.println(x + " " + y + " " + z);
        System.out.println(Arrays.toString(arr));
    }
}