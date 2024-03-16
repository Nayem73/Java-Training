package com.nayemtech;

public class Rectangle implements Shape {
    private int length;
    private int height;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

   public double area() {
        return length * height;
   }
}
