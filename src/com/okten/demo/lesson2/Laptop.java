package com.okten.demo.lesson2;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Laptop extends Product {

    private String cpuModel;

    @Override
    public void printInfo() {
        System.out.println("Name: " + name + ", price: " + price + ", cpu: " + cpuModel);
    }
}
