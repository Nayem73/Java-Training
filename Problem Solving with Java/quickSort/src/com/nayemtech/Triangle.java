package com.nayemtech;

public class Triangle implements Shape {
    private int ground;
    private int height;

    public Triangle(int ground, int height) {
        this.ground = ground;
        this.height = height;
    }

    @Override
    public void calculateShape() {
        double triangleArea = 0.5 * ground * height;
        System.out.print("Area of Triangle with ground = " + this.ground + " and height =  " + this.height + " is: ");
        System.out.println(triangleArea);
    }
}
