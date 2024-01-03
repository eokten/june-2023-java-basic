package com.okten.demo.lesson1;

public class Main {

    public static void main(String[] args) {
        boolean bool = true;
        byte byteNumber = -128; // [-128, 127]
        short shortNumber = -128; // [-(2^15), (2^15)-1]
        int intNumber = 2_000_000_000; // [-(2^31), (2^31)-1]
        long longNumber = 2_000_000_000L; // [-(2^63), (2^63)-1]
        double doubleNumber = 1.2;

        String text = "hello okten"; // String pool
        String text2 = "hello okten";
        String concatenatedString = text.concat(" 123");
        String textWithNew = new String("hello okten");

        System.out.println(text);
        System.out.println(concatenatedString);

        System.out.println(text == text2);
        System.out.println(text == textWithNew);

        System.out.println(text.equals(text2));
        System.out.println(text.equals(textWithNew));
    }
}