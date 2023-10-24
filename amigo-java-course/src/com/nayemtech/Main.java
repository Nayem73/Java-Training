package com.nayemtech;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Point pointA = new Point(2,5);
        Point pointB = pointA;

        pointA.x = 100;

        System.out.println(pointA);
        System.out.println(pointB);
    }
}