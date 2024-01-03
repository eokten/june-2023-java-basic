package com.okten.demo.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {

    public static void main(String[] args) {
        String[] array = new String[2];
        Object[] objectArray = new Object[3];

        objectArray[0] = 1;
        objectArray[1] = new Product();

        array[0] = "element 1";
        array[1] = "element 2";

        System.out.println(Arrays.toString(array));

        for (String arrayElement : array) {
            System.out.println(arrayElement);
        }

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }

        ArrayList<String> dynamicArray = new ArrayList<>(2);
        ArrayList dynamicObjectArray = new ArrayList();

        dynamicArray.add("element 1");
        dynamicArray.add("element 2");
        dynamicArray.add("element 3");
        dynamicArray.add("element 4");

        for (String arrayElement : dynamicArray) {
            System.out.println(arrayElement);
        }

        System.out.println(dynamicArray);

        // принципової різниці нема
        List<String> list = new ArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();
    }
}
