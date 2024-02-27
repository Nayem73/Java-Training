package com.nayemtech;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    @Override
    public void calculateShape() {
        double circleArea = Math.PI * this.radius * this.radius;
        System.out.print("Area of circle with radius = " + this.radius + " is: ");
        System.out.println(circleArea);
    }
}
