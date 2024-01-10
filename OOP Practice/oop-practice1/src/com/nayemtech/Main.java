package com.nayemtech;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Pair> store = new ArrayList<>();
        store.add(new Pair(2,1));
        store.add(new Pair(22,11));
        store.add(new Pair(19,12));
        store.add(new Pair(13,122));
        store.add(new Pair(211,-10));
        store.add(new Pair(4,0));
        store.add(new Pair(-4,9));

        Collections.sort(store, new PairComparator());

        for (Pair X: store) {
            System.out.println(X.first + " " + X.second);
        }
    }
}

class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class PairComparator implements Comparator<Pair> {
    public int compare(Pair a, Pair b) {
        return b.second - a.second;
    }
}