package com.test;

import java.util.TreeSet;
import com.sunbeam.hashset.Book;
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
		Iterator<Book> itr = treeSet.iterator();
		while(itr.hasNext()) {
			Book ele = itr.next();
			System.out.println(ele);
		}
		// Duplicate values removed from after implementing Comparable 
		// output is in sorted order of isbn 
	}
}
