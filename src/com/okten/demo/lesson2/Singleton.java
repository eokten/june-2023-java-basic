package com.okten.demo.lesson2;

//@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Singleton {

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    private Singleton() {
    }

    public void print() {
        System.out.println("hello singleton");
    }
}
