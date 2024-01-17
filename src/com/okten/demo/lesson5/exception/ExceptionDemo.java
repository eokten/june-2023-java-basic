package com.okten.demo.lesson5.exception;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class ExceptionDemo {

    public static void main(String[] args) {
        String[] array = new String[2];

        array[0] = "John";
        array[1] = "Tom";


        try {
            array[2] = "Mike";
        } catch (IndexOutOfBoundsException e) {
            System.out.println("got exception");
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(array));

        try {
            doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

        try {
            doSomething();
        } catch (IOException e) {
            System.out.println("got io exception");
        } catch (CustomException e) {
            System.out.println("got custom exception");
        }

        try {
            doSomething();
        } catch (IOException | CustomException | CustomUncheckedException e) {
            System.out.println("got io or custom exception");
            e.printStackTrace();
        }

        System.out.println("program end");
    }

    public static void doSomething() throws IOException, CustomException {
        if (new Random().nextBoolean()) {
            throw new IOException();
        } else if (new Random().nextBoolean()) {
            throw new CustomException();
        } else {
            throw new CustomUncheckedException();
        }
    }
}
