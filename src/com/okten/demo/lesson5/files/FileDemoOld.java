package com.okten.demo.lesson5.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemoOld {

    public static void main(String[] args) {
        String pathToFile = "resources/test.txt";
        // try-with-resources
        try (FileInputStream fileInputStream = new FileInputStream(pathToFile)) {
            byte[] bytes = fileInputStream.readAllBytes();
            String result = new String(bytes);
            System.out.println(result);
        } catch (IOException e) {
            System.out.println("unable read file");
            e.printStackTrace();
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream(pathToFile, true)) {
            fileOutputStream.write("123".getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
