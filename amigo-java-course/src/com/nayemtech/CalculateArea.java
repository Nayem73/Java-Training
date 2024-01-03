package com.nayemtech;

import java.util.ArrayList;
import java.util.List;

public class CalculateArea {
    public double totalArea(List<Shape> shapes) {
        double sum = 0;
        for (Shape X: shapes) {
            sum +=  X.area();
        }
        return sum;   
    }
}
