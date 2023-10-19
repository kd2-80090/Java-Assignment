package com.test;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;
import com.sunbeam.hashset.Book;

public class TesterBook {
	public static void main(String[] args) {
		Set <Book> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(new Book("WingsOfFire123",900,"APJAbdulKalam",12));
		linkedHashSet.add(new Book("ImmortalsOfMeluha123",250,"Amish",25));
		linkedHashSet.add(new Book("Yayati123",400,"VSKhandekar",35));
		linkedHashSet.add(new Book("MrityunjayaTheDeathConqueror123",900,"ShivajiSawant",12));
		linkedHashSet.add(new Book("WingsOfFire123",500,"APJAbdulKalam",11));
		Iterator<Book> itr = linkedHashSet.iterator();
		while(itr.hasNext()) {
			Book ele = itr.next();
			System.out.println(ele);
		}
		// Duplicate values removed from after added hashCode() 
		// output is in order that we have inserted
	}
}
