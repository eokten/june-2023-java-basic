package com.okten.demo.lesson1;

public class BuilderDemo {

    public static void main(String[] args) {
        Product product = Product.builder()
                .name("Ноутбук")
                .price(10_000)
                .description("опис")
                .build();

        Product customProduct = Product.builderCustom()
                .name("Ноутбук")
                .price(10_000)
                .description("опис")
                .build();

        System.out.println(product);
        System.out.println(customProduct);
    }
}
