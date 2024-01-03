package com.okten.demo.lesson1;

public class ProductDemo {

    public static void main(String[] args) {
        Product product = new Product("Ноутбук", 10000, "опис ноутбуку");
        System.out.println(product.getName() + ", price: " + product.getPrice());
        product.setName("Комп'ютер");
        System.out.println(product.getName() + ", price: " + product.getPrice());
    }
}
