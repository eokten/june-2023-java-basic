package com.okten.demo.lesson2;

public enum SingletonEnum {

    INSTANCE;

    public void print() {
        System.out.println("hello singleton");
    }
}
