package com.okten.demo.lesson2;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class Order {

    private Integer id;

    private ArrayList<Product> products;

    private OrderStatus status;

    public void addProduct(Product product) {
        if (products == null) {
            products = new ArrayList<>();
        }

        products.add(product);
    }
}
