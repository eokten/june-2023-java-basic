package com.okten.demo.lesson5.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Set;

public class FileDemo {

    public static void main(String[] args) {
        String pathToFile = "resources/test.txt";
        String text = "hello goodbye";

//        writeToFile(pathToFile, text);

        readFromFile(pathToFile);
    }

    private static void writeToFile(String pathToFile, String text) {
        Path path = Paths.get(pathToFile);

        try {
            Files.write(path, Set.of(text), StandardOpenOption.APPEND);
//            Files.write(path, text.getBytes(StandardCharsets.UTF_8));
//            Files.writeString(path, text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readFromFile(String pathToFile) {
        Path path = Paths.get(pathToFile);

        try {
            String result = Files.readString(path);
            System.out.println(result);
//            byte[] bytes = Files.readAllBytes(path);
//            String result = new String(bytes, StandardCharsets.UTF_8);
//            System.out.println(result);
//            Files.readAllLines(path)
//                    .stream()
//                    .filter(line -> line.contains("a"))
////                    .forEach(System.out::println);
//            Files.readAllLines(path)
//                    .stream()
//                    .map(String::length)
//                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
