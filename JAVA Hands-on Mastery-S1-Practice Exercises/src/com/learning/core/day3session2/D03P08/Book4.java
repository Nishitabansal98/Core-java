package com.learning.core.day3session2.D03P08;

import java.util.*;

class Book4 implements Comparable<Book> {
    private int bookId;
    private String title;
    private double price;
    private double weight;
    private String author;

    public Book4(int bookId, String title, double price, double weight, String author) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.weight = weight;
        this.author = author;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Price: $" + price + ", Weight: " + weight + " lbs, Author: " + author;
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, price, weight, author);
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;
        return bookId == book.bookId &&
                Double.compare(book.price, price) == 0 &&
                Double.compare(book.weight, weight) == 0 &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    // Override compareTo method for natural ordering based on author names
    @Override
    public int compareTo(Book other) {
        return this.author.compareTo(other.author);
    }
}

public class Book4 {
    public static void main(String[] args) {
        // Create TreeSet to store book details sorted by author names
        Set<Book> bookSet = new TreeSet<>();

        // Predefined book details
        Book book1 = new Book(101, "The Great Gatsby", 15.99, 2.5, "F. Scott Fitzgerald");
        Book book2 = new Book(102, "To Kill a Mockingbird", 12.50, 3.0, "Harper Lee");
        Book book3 = new Book(103, "1984", 10.75, 1.8, "George Orwell");
        Book book4 = new Book(104, "Pride and Prejudice", 18.25, 2.7, "Jane Austen");
        Book book5 = new Book(105, "The Catcher in the Rye", 13.99, 2.2, "J.D. Salinger");

        // Add books to the TreeSet
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        // Print all book details sorted by author names
        System.out.println("Book Details Sorted by Author Names:");
        for (Book book : bookSet) {
            System.out.println(book);
        }
    }
}