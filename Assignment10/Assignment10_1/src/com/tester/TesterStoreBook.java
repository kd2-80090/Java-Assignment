package com.tester; 

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.sunbeam.book.StoreBook;

public class TesterStoreBook {
	
	static int menu() {
		System.out.println("**************************************************");
		System.out.println("0.EXIT");
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Search a book");
		System.out.println("4. Delete at book given index");
		System.out.println("5. Delete a book with given isbn");
		System.out.println("6. Reverse the list");
		System.out.println("Enter your choice = ");
		int choice = new Scanner(System.in).nextInt();
		System.out.println("**************************************************");
		return choice;
	}
	public static void main(String[] args) {
		int choice;
		StoreBook b;
		int index;
		List<StoreBook> list = new ArrayList<>();
		while((choice=menu())!=0) {
			switch(choice) {
			case 1:		//add book
					b = new StoreBook();
					b.accept();
					System.out.println("-----------------------");
					System.out.println("Book Added Successfully");
					if(list.contains(b)) {
						index=list.indexOf(b);
						b=list.get(index);
						b.setQuantity(b.getQuantity()+1);
					}

				break;
			case 2:		//display all books
				for(int i=0;i<list.size();i++) {
					System.out.println(list.get(i));
				}
				break;
			case 3:		//search a book
				System.out.println("Enter Book id to get details :");
				String isbn = new Scanner(System.in).next();
				StoreBook key = new StoreBook();
				
				key.setIsbn(isbn);
				if(list.contains(key))
					System.out.println("Book Details are : \n"+key);
				else
					System.out.println("Book Not Found");
				break;
			case 4:		//remove book at specific index
				System.out.println("Enter index at which element to be deleted: ");
				index=new Scanner(System.in).nextInt();
				list.remove(index);
				System.out.println("-----------------------");
				System.out.println("Deleted Successfully");
				break;
			case 5:		//remove book with given isbn
				System.out.println("Enter unique book id which to delete from a list : ");
				String check=new Scanner(System.in).next();
				StoreBook value = new StoreBook();
				value.setIsbn(check);
				list.remove(value.getIsbn());
				System.out.println("-----------------------");
				System.out.println("Deleted Successfully");
				break;
			case 6:		//display number of books
				System.out.println("Size : "+ list.size());
				break;
			default:
				System.out.println("Wrong Choice...:(");
				break;
			}
		}
		System.out.println("Thank you for using our app...:)");
	}
}










