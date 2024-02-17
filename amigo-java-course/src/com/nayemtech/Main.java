package com.nayemtech;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> differentShapes = new ArrayList<>();
        Shape circle1 = new Circle(4);
        Shape triangle1 = new Triangle(5, 3);

        differentShapes.add(circle1);
        differentShapes.add(triangle1);


        for (Shape currentShape : differentShapes) {
            currentShape.calculateShape();
        }
    }
}