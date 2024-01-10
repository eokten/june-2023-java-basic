package com.okten.demo.lesson3;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Connection;

@Data
@AllArgsConstructor
public class Circle extends AbstractShape implements Shape, Colorable {

    private double r;
    private String color;

    @Override
    public double getArea() {
        return 3.14 * r * r / 2;
    }

    @Override
    public String getColor() {
        return color;
    }
}
