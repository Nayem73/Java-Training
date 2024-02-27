package com.nayemtech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> store = new ArrayList<>(List.of(4,-1,0,9,2,-4));
        int n = store.size();

        System.out.println(store);
        quickSort(store, 0, n-1);
        System.out.println(store);
    }


    public static int pivot(List<Integer> store, int lo, int hi) {
        int indx = lo;
        for (int i = lo; i < hi; i++) {
            if (store.get(i) < store.get(hi)) {
                Collections.swap(store, i, indx);
                indx++;
            }
        }

        Collections.swap(store, indx, hi);
        return indx;
    }
    public static void quickSort(List<Integer> store, int lo, int hi) {
        if (lo >= hi) return;
        int pivot = pivot(store, lo, hi);
        quickSort(store, lo, pivot-1);
        quickSort(store, pivot+1, hi);
    }
}