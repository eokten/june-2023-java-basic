package com.okten.homeworks.lesson1;

import java.util.Arrays;

public class Book {

    private String title;
    private int pages;
    private String genre;

    private String[] authors;

    public Book() {
    }

    public Book(String title, int pages, String genre, String[] authors) {
        this.title = title;
        this.pages = pages;
        this.genre = genre;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", genre='" + genre + '\'' +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }
}
