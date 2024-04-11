
package com.learning.core.day3session2.D03P08;

import java.util.*;

class Book implements Comparable<Book> {
    private int bookId;
    private String style;
    private double price;
    private Date dateOfPublication;
    private String author;

    public Book(int bookId, String style, double price, Date dateOfPublication, String author) {
        this.bookId = bookId;
        this.style = style;
        this.price = price;
        this.dateOfPublication = dateOfPublication;
        this.author = author;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Style: " + style + ", Price: $" + price + ", Date of Publication: " + dateOfPublication + ", Author: " + author;
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(bookId, style, price, dateOfPublication, author);
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
                Objects.equals(style, book.style) &&
                Objects.equals(dateOfPublication, book.dateOfPublication) &&
                Objects.equals(author, book.author);
    }

    // Override compareTo method for natural ordering
    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.bookId, other.bookId);
    }
}

public class Main3 {
    public static void main(String[] args) {
        // Create TreeSet to store book details
        Set<Book> bookSet = new TreeSet<>();

        // Predefined book details
        Book book1 = new Book(101, "Fiction", 20.99, new Date(), "John Smith");
        Book book2 = new Book(102, "Non-fiction", 15.50, new Date(), "Jane Doe");
        Book book3 = new Book(103, "Thriller", 25.75, new Date(), "Alice Johnson");
        Book book4 = new Book(104, "Science Fiction", 18.25, new Date(), "Bob Brown");
        Book book5 = new Book(105, "Romance", 12.99, new Date(), "Eva Lee");

        // Add books to the TreeSet
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        // Print all book details
        System.out.println("Book Details:");
        for (Book book : bookSet) {
            System.out.println(book);
        }
    }
}