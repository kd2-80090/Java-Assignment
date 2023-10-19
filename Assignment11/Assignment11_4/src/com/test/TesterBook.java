package com.test;

import java.util.TreeSet;
import com.sunbeam.hashset.Book;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

public class TesterBook {
	public static void main(String[] args) {
		Set<Book> treeSet = new TreeSet<>();
		treeSet.add(new Book("WingsOfFire123",900,"APJAbdulKalam",12));
		treeSet.add(new Book("ImmortalsOfMeluha123",250,"Amish",25));
		treeSet.add(new Book("Yayati123",400,"VSKhandekar",35));
		treeSet.add(new Book("MrityunjayaTheDeathConqueror123",900,"ShivajiSawant",12));
		treeSet.add(new Book("WingsOfFire123",500,"APJAbdulKalam",11));
//		Iterator<Book> itr = treeSet.iterator();
//		while(itr.hasNext()) {
//			Book ele = itr.next();
//			System.out.println(ele);
//		}
		class BookPriceDescComparator implements Comparator<Book> {

			@Override
			public int compare(Book book1, Book book2) {
				int diff = - Double.compare(book1.getPrice(), book2.getPrice());
				return diff;
			}
			
		}
		BookPriceDescComparator comparator = new BookPriceDescComparator();
		
		Set <Book> set = new TreeSet<>(comparator);
		set.add(new Book("WingsOfFire123",900,"APJAbdulKalam",12));
		set.add(new Book("ImmortalsOfMeluha123",250,"Amish",25));
		set.add(new Book("Yayati123",400,"VSKhandekar",35));
		set.add(new Book("MrityunjayaTheDeathConqueror123",1000,"ShivajiSawant",12));
		set.add(new Book("WingsOfFire123",500,"APJAbdulKalam",11));
		
		System.out.println("Using iterator()");
		Iterator <Book> itr1 = set.iterator();
		while(itr1.hasNext()) {
			Book book = itr1.next();
			System.out.println(book);
		}
		System.out.println();

		System.out.println("******************************************");

		class BookPriceDescComparator1 implements Comparator<Book> {

			@Override
			public int compare(Book book1, Book book2) {
				int diff = Double.compare(book1.getPrice(), book2.getPrice());
				return diff;
			}
			
		}
		BookPriceDescComparator1 comparator1 = new BookPriceDescComparator1();

		TreeSet <Book> treeset = new TreeSet<>(comparator1);
		treeset.add(new Book("WingsOfFire123",900,"APJAbdulKalam",12));
		treeset.add(new Book("ImmortalsOfMeluha123",250,"Amish",25));
		treeset.add(new Book("Yayati123",400,"VSKhandekar",35));
		treeset.add(new Book("MrityunjayaTheDeathConqueror123",1000,"ShivajiSawant",12));
		treeset.add(new Book("WingsOfFire123",500,"APJAbdulKalam",11));
		
		System.out.println();
		
		System.out.println("Using descendingIterator()");
		Iterator <Book> itr2 = treeset.descendingIterator();
		while(itr2.hasNext()) {
			Book book1 = itr2.next();
			System.out.println(book1);
		}
	}
}
