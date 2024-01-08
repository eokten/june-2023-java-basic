package com.okten.demo.lesson2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private static int count = 0;

    protected String name;

    protected Double price;

    protected ArrayList<Review> reviews;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Product name: " + name + ", price: " + price);
    }

    // 0.3 + 0.6 = 0.9
    // Double: 0.3 + 0.6 ~= 0.90000000001
    // BigDecimal: 0.3 + 0.6 = 0.9
    public Number getNumber() {
        return 1;
    }

    public void addReview(String text, int rating) {
        Review review = new Review();
        review.setText(text);
        review.setRating(rating);

        if (reviews == null) {
            reviews = new ArrayList<>();
        }

        reviews.add(review);
    }
    public static ProductBuilder builderCustom() {
        return new ProductBuilder();
    }

    public static class ProductBuilder {

        private String name;

        private Double price;

        private String description;

        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder price(double price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(name, price);
        }
    }

    public class InnerNonStaticClass {

        private String name;

        public void doSomething() {
            System.out.println(Product.this.name);
        }
    }
}
