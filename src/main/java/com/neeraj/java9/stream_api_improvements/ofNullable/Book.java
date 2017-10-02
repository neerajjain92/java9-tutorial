package com.neeraj.java9.stream_api_improvements.ofNullable;

import java.util.Set;

public class Book {

    public final String title;
    public final Set<String> authors;
    public final Double price;

    public String getTitle() {
        return title;
    }

    public Set<String> getAuthors() {
        return authors;
    }

    public Double getPrice() {
        return price;
    }

    public Book(String title, Set<String> authors, Double price) {
        this.title = title;
        this.authors = authors;
        this.price = price;
    }

    public static Book getBook() {
        Set<String> authors = Set.of("Joshua Bloch","James Gosling");
        return new Book("Effective Java",authors, (double) 459);
    }
}
