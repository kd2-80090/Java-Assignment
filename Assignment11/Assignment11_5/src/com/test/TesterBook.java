package com.test;

import java.util.*;
import com.sunbeam.hashset.*;

public class TesterBook {
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("***********************");
		System.out.println("0. EXIT");
		System.out.println("1. Add book.");
		System.out.println("2. Search a book.");
		System.out.println("Enter your choice = ");
		int choice = sc.nextInt();
		System.out.println("***********************");
		return choice;
	}
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		Map<String,Book> map = new HashMap<>();
		while((choice=menu())!=0) {
			switch(choice) {
			case 1: //insert in map
				Book b = new Book();
				b.accept(sc);
				map.put(b.getIsbn(), b);	// accept book from user
				System.out.println("---------------------------");
				System.out.println(" Book added successfully.");
				break;
			case 2: //find in map
				System.out.println("Enter book id to find in list : ");
				String isbn = sc.next();
				if(map.get(isbn)!=null) {
				Book f = map.get(isbn);
				System.out.println("Book found : "+f);
				}
				else 
					System.out.println("Book not found.");
				break;
			default:
				System.out.println("Wrong choice...:(");
				break;
			}
		}
		System.out.println("Thank you for using our app...:)");
	}
}
