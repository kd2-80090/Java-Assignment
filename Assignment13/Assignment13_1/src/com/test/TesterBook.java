package com.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

import com.dataoutputstream.book.Book;

public class TesterBook {
	
	static int menu() {
		System.out.println("**************************************************");
		System.out.println("0.EXIT");
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Search a book");
		System.out.println("4. Delete at book given index");
		System.out.println("5. Delete a book with given isbn");
		System.out.println("6. Reverse the list");
		System.out.println("7. Save in a file");
		System.out.println("8. Load from a file");
		System.out.println("Enter your choice = ");
		int choice = new Scanner(System.in).nextInt();
		System.out.println("**************************************************");
		return choice;
	}
	
	public static void saveBook(List <Book>list) {
		try(FileOutputStream fout = new FileOutputStream("Book.txt")) {
			try(DataOutputStream dout = new DataOutputStream(fout)){
				for (Book book : list) {
					dout.writeUTF(book.getIsbn());
					dout.writeDouble(book.getPrice());
					dout.writeUTF(book.getAuthorName());
					dout.writeInt(book.getQuantity());				
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Books Saved!");
	}
	
	public static List<Book> loadBook() {
		List<Book> list=new CopyOnWriteArrayList<Book>();
		try(FileInputStream fin = new FileInputStream("Book.txt")) {
			try(DataInputStream din = new DataInputStream(fin)){
				while(true)
				{
					Book b = new Book();
					b.setIsbn(din.readUTF());
					b.setPrice(din.readDouble());
					b.setAuthorName(din.readUTF());
					b.setQuantity(din.readInt());
					list.add(b);
				}
			}
			
		}
		catch(EOFException e) {
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Books loaded from a file...");
		return list;
		
	}
	
	public static void main(String[] args) {
		int choice;
		Book sb;
		int index;
		Scanner sc = new Scanner(System.in);
		List<Book> list = new CopyOnWriteArrayList<>();
		
//		class PriceComp implements Comparator<Book>{
//			@Override
//				public int compare(Book b1, Book b2) {
//				int diff= Double.compare(b1.getPrice(), b2.getPrice());
//				return diff;	
//				}
//		}
//		PriceComp pc=new PriceComp();
		
		while((choice=menu())!=0) {
			switch(choice) {
			case 1:		//add book
//					b = new StoreBook();
//					b.accept();
//					System.out.println("-----------------------");
//					System.out.println("Book Added Successfully");
//					if(list.contains(b)) {
//						index=list.indexOf(b);
//						b=list.get(index);
//						b.setQuantity(b.getQuantity()+1);
//					}
				String isbnc;
			    System.out.println("Enter isbn to check if the book is in the list or not : ");
			    isbnc = new Scanner(System.in).next();
			    Book key = new Book();
			    key.setIsbn(isbnc);
			    
			    ListIterator< Book> booklist=list.listIterator();
			   
			    if(list.contains(key))//Override equals method for this(because default it(equals) check for references)
			    {	int qty,newQty;
			        System.out.println("Book is in the list");
			        System.out.println("Enter Quantity to add");
			        qty=sc.nextInt();
			        
			         while(booklist.hasNext()) 
			         {
			        	 Book bookObj= booklist.next();
			        	if(bookObj.equals(key))
			        	{
			        		newQty=bookObj.getQuantity()+qty;
			        		bookObj.setQuantity(newQty);
			        	}
			         }
			    } else {
			        System.out.println("Book is not in the list");
			        sb=new Book();
			  		sb.accept();
			  		list.add(sb);
			    }
				break;
			case 2:		//display all books
				Book b2;
				for(int i=0;i<list.size();i++) {
					b2=list.get(i);
					System.out.println(b2);
				}
				break;
			case 3:		//search a book
				System.out.println("Enter unique Book id to get details :");
				String isbn = new Scanner(System.in).next();
				Book key1 = new Book();
				
				key1.setIsbn(isbn);
				index=list.indexOf(key1);
				if(index>=0) { 
					System.out.println("Book is in the list");
					System.out.println(list.get(index));
				}
				else
					 System.out.println("Book is not in the list");
				break;
			case 4:		//remove book at specific index
				int index4;
				System.out.println("Enter index(0 to "+list.size()+") to delete object from list : ");
				index4 = new Scanner(System.in).nextInt();			
				list.remove(index4);
				break;
			case 5:		//remove book with given isbn
				String isbnc5;
			    System.out.println("Enter isbn to delete a book : ");
			    isbnc5 = new Scanner(System.in).next();
			    Book key5= new Book();
			    key5.setIsbn(isbnc5);
			    ListIterator <Book> booklist5=list.listIterator();
			    if(list.contains(key5))//Override equals method for this(because default it(equals) check for references)
			    {
			    	while(booklist5.hasNext()) 
			         {
			    		Book bookObj= booklist5.next();
			        	if(bookObj.equals(key5))
			        	{
			        		list.remove(bookObj);
					        System.out.println("Book is deleted from the list");
			        	}
			         }
			        
			    } 
			    else 
			        System.out.println("Can't delete, Book is not in the list");
			    break;
			case 6:		//display number of books
				Collections.reverse(list);
				System.out.println(list);
				break;
			case 7:
				saveBook(list);
				break;
			case 8:
				list=loadBook();
				break;
			default:
				System.out.println("Wrong choice...:(");
				break;
			}
		}
		System.out.println("Thank you for using our app...:)");
	}
}









