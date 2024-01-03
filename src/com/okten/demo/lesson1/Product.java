package com.okten.demo.lesson1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Product {

    private String name;

    private double price;

    private String description;

    // щось подібне lombok генерує при анотації @Builder
    public static ProductBuilder builderCustom() {
        return new ProductBuilder();
    }

    public static class ProductBuilder {

        private String name;

        private double price;

        private String description;

        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder price(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder description(String description) {
            this.description = description;
            return this;
        }

        public Product build() {
            return new Product(name, price, description);
        }
    }
}
