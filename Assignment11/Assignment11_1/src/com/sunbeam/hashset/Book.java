package com.sunbeam.hashset;

import java.util.Objects;
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
	public void accept(Scanner sc) {
		System.out.println("Enter unique book id = ");
		this.isbn = sc.next();
		System.out.println("Enter price of book = ");
		this.price = sc.nextDouble();
		System.out.println("Enter author name = ");
		this.authorName = sc.next();
		System.out.println("Enter quantity = ");
		this.quantity = sc.nextInt();
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
	@Override
	public int hashCode() {
		return Objects.hash(this.isbn);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this==obj)
			return true;
		if(obj instanceof Book) {
			Book other = (Book) obj;
			if(this.isbn.equals(other.isbn))
				return true;
		}
		return false;
	}
}
