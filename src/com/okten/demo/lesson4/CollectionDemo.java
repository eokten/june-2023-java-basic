package com.okten.demo.lesson4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo {

    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();

        names.add("John");
        names.add("John");
        names.add("Alex");
        names.add("John");
        names.add("John");
        names.add(null);
        names.add(null);

        System.out.println(names);

        Collection<String> uniqueNames = new HashSet<>();

        uniqueNames.add("John");
        uniqueNames.add("John");
        uniqueNames.add("Alex");
        uniqueNames.add("John");
        uniqueNames.add("John");
        uniqueNames.add(null);
        uniqueNames.add(null);

        System.out.println(uniqueNames);
    }
}
