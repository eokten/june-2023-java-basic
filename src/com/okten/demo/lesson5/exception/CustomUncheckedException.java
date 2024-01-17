package com.okten.demo.lesson5.exception;

public class CustomUncheckedException extends RuntimeException {

    @Override
    public void printStackTrace() {
        System.out.println("stack trace from custom unchecked exception");
        super.printStackTrace();
    }
}
