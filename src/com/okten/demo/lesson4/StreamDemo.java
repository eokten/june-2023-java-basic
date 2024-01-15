package com.okten.demo.lesson4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamDemo {

    public static void main(String[] args) {
        List<Vegetable> vegetables = new ArrayList<>();

        vegetables.add(new Vegetable(1, "Banana"));
        vegetables.add(new Vegetable(2, "Tangerin"));
        vegetables.add(new Vegetable(3, "Strawberry"));
        vegetables.add(new Vegetable(4, "Cherry"));
        vegetables.add(new Vegetable(5, "Kivi"));

        var filteredVegetables = new ArrayList<>();
        var count = 0;

        for (Vegetable vegetable : vegetables) {
            System.out.println(vegetable);

            if (vegetable.getName().contains("a")) {
                count += vegetable.getName().length();
                filteredVegetables.add(vegetable.getName().length());
            }
        }

        System.out.println("Filtered vegetables: " + filteredVegetables);

        // from Java 8

//        Stream<Vegetable> stream = vegetables.stream();
//        stream.forEach(System.out::println);
//        stream.forEach(System.out::println); - no

        var filteredVegetablesWithStream = vegetables
                .stream()
                .filter(vegetable -> vegetable.getName().contains("a"))
                .mapToInt(vegetable -> vegetable.getName().length())
                .sum();

        System.out.println("Filtered vegetables: " + filteredVegetablesWithStream);

        Map<String, Vegetable> vegetableByName = vegetables
                .stream()
                .collect(toMap(Vegetable::getName, Function.identity()));

        vegetables
                .stream()
                .filter(vegetable -> vegetable.getName().contains("a"))
                .map(vegetable -> vegetable.getName())
                .collect(Collectors.toCollection(() -> new LinkedList<>()));
        boolean containsAAndHasLengthGreaterThan5 = vegetables
                .stream()
                .limit(10)
                .filter(vegetable -> vegetable.getName().contains("a"))
                .map(vegetable -> vegetable.getName())
                .skip(5)
                .allMatch(vegetable -> vegetable.length() > 5);

        Map<String, List<Vegetable>> vegetablesByType = new HashMap<>();

        vegetablesByType.put("banana", List.of(new Vegetable(1, "banana1"), new Vegetable(2, "banana2")));
        vegetablesByType.put("cherry", List.of(new Vegetable(123, "cherry1"), new Vegetable(345, "cherry2")));
        vegetablesByType.put("Kivi", List.of(new Vegetable(987, "Kivi1"), new Vegetable(534, "Kivi2"), new Vegetable(234, "Kivi3"), new Vegetable(435435, "Kivi4")));

        int count2 = 0;

        for (Map.Entry<String, List<Vegetable>> entries : vegetablesByType.entrySet()) {
            if (entries.getValue() == null) {
                continue;
            }

            for (Vegetable vegetable : entries.getValue()) {
                if (vegetable == null) {
                    continue;
                }

                if (vegetable.getName().contains("a")) {
                    count2 += vegetable.getName().length();
                }
            }
        }

        System.out.println("Count2: " + count2);

        int sum = vegetablesByType
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() != null)
                .flatMap(entry -> entry.getValue().stream())
                .filter(Objects::nonNull)
                .mapToInt(vegetable -> vegetable.getName().length())
                .sum();

        Comparator<Vegetable> compareByName = Comparator.comparing(Vegetable::getName);
        Comparator<Vegetable> compareById = Comparator.comparing(Vegetable::getId);

        Comparator<Vegetable> vegetableComparator = compareByName.thenComparing(compareById);
        Comparator<Vegetable> vegetableComparator2 = compareById.thenComparing(compareByName);
    }
}
