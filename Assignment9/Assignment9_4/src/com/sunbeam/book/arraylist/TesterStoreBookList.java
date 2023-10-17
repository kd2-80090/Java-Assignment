package com.sunbeam.book.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class TesterStoreBookList {
	
	static int menu() {
		System.out.println("**************************************************");
		System.out.println("0.EXIT");
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Delete at book given index");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
		System.out.println("7. Sort all books by price in desc order");
		System.out.println("Enter your choice = ");
		int choice = new Scanner(System.in).nextInt();
		System.out.println("**************************************************");
		return choice;
	}
	public static void main(String[] args) {
		int choice;
		Book b;
		int index;
		List<Book> list = new ArrayList<>();
		while((choice=menu())!=0) {
			switch(choice) {
			case 1:		//add book
				b = new Book();
				b.accept();
				list.add(b);
				System.out.println("-----------------------");
				System.out.println("Book Added Successfully");
				break;
			case 2:		//display all books
//				for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//					Book showList = (Book) iterator.next();
//					System.out.println(showBookList);
//				}
				for (Book book : list) {
					System.out.println(book);
				}
				break;
			case 3:		//remove book at specific index
				System.out.println("Enter index at which element to be deleted: ");
				index=new Scanner(System.in).nextInt();
				list.remove(index);
				System.out.println("-----------------------");
				System.out.println("Deleted Successfully");
				break;
			case 4:		//check if book present
				String isbn = new Scanner(System.in).next();
				Book key = new Book();
				key.setIsbn(isbn);
				if(list.contains(key))
					System.out.println("Found");
				else
					System.out.println("Not Found");
				break;
			case 5:		//to delete all books
				list.clear();
				System.out.println("-----------------------");
				System.out.println("All Books Removed ");
				break;
			case 6:		//display number of books
				System.out.println("Size : "+ list.size());
				break;
			case 7:		//sort by price index
				class BookPriceComparator implements Comparator<Book> {
					public int compare(Book b1,Book b2) {
						int diff = - Double.compare(b1.getPrice(), b2.getPrice());
						return diff;
					}
				}
				BookPriceComparator comparator = new BookPriceComparator();
				list.sort(comparator);
				for (Book book : list) {
					System.out.println(book);
				}
				break;
			default:
				System.out.println("Wrong Choice...:(");
				break;
			}
		}
		System.out.println("Thank you for using our app...:)");
	}
}











