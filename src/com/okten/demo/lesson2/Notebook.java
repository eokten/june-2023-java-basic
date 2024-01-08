package com.okten.demo.lesson2;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Notebook extends Product {

    private int numberOfSheets;

    @Override
    public void printInfo() {
        System.out.println("name: " + name + ", price: " + price + ", number of sheets: " + numberOfSheets);
    }

    @Override
    // extent return type Number -> Integer, Double, BigDecimal
    public Integer getNumber() {
        return 2;
    }
}
