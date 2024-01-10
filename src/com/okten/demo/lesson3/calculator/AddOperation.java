package com.okten.demo.lesson3.calculator;

public class AddOperation implements Operation {
    @Override
    public int apply(int a, int b) {
        return a + b;
    }
}
