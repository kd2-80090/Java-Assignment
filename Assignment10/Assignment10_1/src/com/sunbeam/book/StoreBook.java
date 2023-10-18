package com.sunbeam.book;

import java.util.Objects;
import java.util.Scanner;

public class StoreBook {
	String isbn;
	double price;
	String authorName;
	int quantity;
	public StoreBook() {
		this("",0,"",0);
	}
	public StoreBook(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	public void accept() {
		Scanner sc  =  new Scanner(System.in);
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
		return "StoreBookList [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity="
				+ quantity + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof StoreBook))
			return false;
		StoreBook other = (StoreBook) obj;
		if(this.isbn.equals(other.isbn))
			return true;
		else 
			return false;
//		return Objects.equals(authorName, other.authorName) && Objects.equals(isbn, other.isbn)
//				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity;
	}
	
}