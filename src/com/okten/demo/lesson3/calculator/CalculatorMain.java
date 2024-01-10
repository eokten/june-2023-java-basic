package com.okten.demo.lesson3.calculator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class CalculatorMain {

    public static void main(String[] args) {
        Operation add = new AddOperation();

        Operation remove = new Operation() {
            @Override
            public int apply(int a, int b) {
                return a - b;
            }
        };

        Operation multiply = (a, b) -> a * b;

        Operation divide = (a, b) -> {
            if (b == 0) {
                System.out.println("Ділити на 0 не можна");
                return 0;
            } else {
                return a / b;
            }
        };

        System.out.println(add.apply(5, 2));
        System.out.println(remove.apply(5, 2));
        System.out.println(multiply.apply(2, 2));
        System.out.println(divide.apply(4, 2));
        System.out.println(divide.apply(4, 0));

        Function<String, Integer> calculateLength = text -> text.length();
        BiFunction<Integer, Integer, Integer> addOperationWithMethodReference = add::apply;
        BinaryOperator<Integer> asd = add::apply;
        Consumer<String> stringConsumer = text -> System.out.println(text);
        Supplier<String> stringSupplier = () -> "test value";

        System.out.println(calculateLength.apply("string"));
    }
}
