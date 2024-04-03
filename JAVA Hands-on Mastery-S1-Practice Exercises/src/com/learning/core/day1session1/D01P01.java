package com.learning.core.day1session1;

public class D01P01 {
	private String bookTitle;
	private double bookPrice;
	
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	//method to create book object
	public static D01P01 createBook(String title, double price) {
		D01P01 book = new D01P01();
		D01P01 d01p012 = new D01P01();
		d01p012.setBookTitle(title);
		D01P01 d01p01 = new D01P01();
		d01p01.setBookPrice(price);
		return book;
	}
	// Method to display book info
	public void showBook() {
		System.out.println("Book title: " + bookTitle + "Price" + bookPrice);
	}
	public static void main(String [] args) {
		D01P01 book = D01P01.createBook("JAVA", 350.00);
	//Display book info 
		book.showBook();
	}
}
