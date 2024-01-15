package com.okten.demo.lesson4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, Vegetable> vegetables = new HashMap<>();

        Vegetable banana = new Vegetable(1, "Банан");
        vegetables.put("banana", banana);
        vegetables.put("tangarin", new Vegetable(2, "Мандарин"));

        System.out.println(vegetables);

        for (Vegetable vegetable : vegetables.values()) {

        }

        for (Map.Entry<String, Vegetable> entry : vegetables.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

//        Vegetable banana2 = new Vegetable(1, "Банан");
//        banana != banana2;
//        banana.hashCode() == banana2.hashCode();

        vegetables.get("banana"); // hashCode = 1_276_351_827
        // 1 -> table[1] =
        vegetables.get("weruy3fhw984tyh3o874ctbo8e7rwcgfboiuweycgbfauiwey");


        Map<String, List<Vegetable>> vegs = new HashMap<>(1_000_000, 1);

        // 750 -> 2000, 749 * loadFactor (0.75) must be < table.size
    }
}
