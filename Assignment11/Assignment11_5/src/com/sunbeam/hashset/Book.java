package com.sunbeam.hashset;

import java.util.Scanner;

public class Book {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	public Book() {
		this("",0,"",0);
	}
	public Book(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	public Book accept(Scanner sc) {
		System.out.println("Enter unique book id = ");
		this.isbn = sc.next();
		System.out.println("Enter price of book = ");
		this.price = sc.nextDouble();
		System.out.println("Enter author name = ");
		this.authorName = sc.next();
		System.out.println("Enter quantity = ");
		this.quantity = sc.nextInt();
		return new Book(this.isbn,this.price,this.authorName,this.quantity);
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
}
