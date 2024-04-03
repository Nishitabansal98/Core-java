package com.learning.core.day1session1;

	public class Book {
	    private String bookTitle;
	    private double bookPrice;

	    // Getter and setter methods for BookTitle
	    public String getBookTitle() {
	        return bookTitle;
	    }

	    public void setBookTitle(String bookTitle) {
	        this.bookTitle = bookTitle;
	    }

	    // Getter and setter methods for BookPrice
	    public double getBookPrice() {
	        return bookPrice;
	    }

	    public void setBookPrice(double bookPrice) {
	        this.bookPrice = bookPrice;
	    }

	    // Method to create a book object
	    public static Book createBook(String title, double price) {
	        Book book = new Book();
	        book.setBookTitle(title);
	        book.setBookPrice(price);
	        return book;
	    }

	    // Method to display book information
	    public void showBook() {
	        System.out.println("BookTitle: " + bookTitle + ", Price: " + bookPrice);
	    }

	    public static void main(String[] args) {
	        // Creating a book object with given input
	        Book book = Book.createBook("javaprogramming", 350.00);
	        
	        // Displaying the book information
	        book.showBook();
	    }
	}