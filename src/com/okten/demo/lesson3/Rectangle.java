package com.okten.demo.lesson3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rectangle implements Shape {

    private double a;
    private double b;

    @Override
    public double getArea() {
        return a * b;
    }
}
