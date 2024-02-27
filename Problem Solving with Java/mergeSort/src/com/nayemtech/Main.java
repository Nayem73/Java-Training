package com.nayemtech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //List<Integer> store = new ArrayList<>(List.of(4,5,2,9,-1));
        List<Integer> store = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = scanner.nextInt();
            store.add(tmp);
        }

        System.out.println(store);
        mergeSort(store, 0, n-1);
        System.out.println(store);
    }

    public static void mergeSort(List<Integer> store, int lo, int hi) {
        if (lo == hi) return;
        int mid = (lo+hi) / 2;
        mergeSort(store, lo, mid);
        mergeSort(store, mid+1, hi);

        List<Integer> firstPart = new ArrayList<>();
        List<Integer> secondPart = new ArrayList<>();
        for (int i = lo; i <= mid; i++) firstPart.add(store.get(i));
        for (int i = mid+1; i <= hi; i++) secondPart.add(store.get(i));

        int firstPartIndx = 0, secondPartIndx = 0;
        int storeIndx = lo;
        while (firstPartIndx < firstPart.size() && secondPartIndx < secondPart.size()) {
            if (firstPart.get(firstPartIndx) < secondPart.get(secondPartIndx)) {
                store.set(storeIndx, firstPart.get(firstPartIndx));
                storeIndx++;
                firstPartIndx++;
            } else {
                store.set(storeIndx, secondPart.get(secondPartIndx));
                storeIndx++;
                secondPartIndx++;
            }
        }

        while (firstPartIndx < firstPart.size()) {
            store.set(storeIndx, firstPart.get(firstPartIndx));
            storeIndx++;
            firstPartIndx++;
        }
        while (secondPartIndx < secondPart.size()) {
            store.set(storeIndx, secondPart.get(secondPartIndx));
            storeIndx++;
            secondPartIndx++;
        }
    }
}