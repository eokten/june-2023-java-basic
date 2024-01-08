package com.okten.demo.lesson2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Product pencil = new Product();
        pencil.setName("Олівець");
        pencil.setPrice(1.99);

        // from Java 17
        var laptop = new Laptop();
        laptop.setName("Ноутбук");
        laptop.setPrice(9999D);
        laptop.setCpuModel("Intel Core i5");

        Notebook notebook = new Notebook();
        notebook.setName("Зошит");
        notebook.setPrice(4.99);
        notebook.setNumberOfSheets(16);

        products.add(pencil);
        products.add(laptop);
        products.add(notebook);

        for (Product product : products) {
            product.printInfo();
        }

        // composition
        laptop.addReview("good", 10);
        System.out.println("Reviews: " + laptop.getReviews());

        // aggregation
        Order order = new Order();
        order.addProduct(laptop);
        System.out.println("Order items: " + order.getProducts());

        order.setStatus(OrderStatus.ACTIVE);
        order.getStatus().printUserFriendly();

        new Product.ProductBuilder() // only 1 object - ProductBuilder
                .price(12)
                .name("test")
                .build();

        Product.InnerNonStaticClass innerNonStaticClass = new Product().new InnerNonStaticClass(); // 2 objects - product, innerNonStaticClass

        SingletonEnum.INSTANCE.print();

        Singleton.getInstance().print();

    }

    private static ArrayList<Order> orders = new ArrayList<>();

    public static Order getOrdersByStatus(OrderStatus orderStatus) {
        for (Order order : orders) {
            if (order.getStatus().equals(orderStatus)) {
                return order;
            }
        }

        return null;
    }

    public static Order getActiveOrders() {
        return getOrdersByStatus(OrderStatus.ACTIVE);
    }
}
