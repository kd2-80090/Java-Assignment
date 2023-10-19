package com.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import com.sunbeam.hashset.Book;

public class TesterBook {
	public static void main(String[] args) {
		Set <Book> hashSet = new HashSet<>();
		hashSet.add(new Book("WingsOfFire123",900,"APJAbdulKalam",12));
		hashSet.add(new Book("ImmortalsOfMeluha123",250,"Amish",25));
		hashSet.add(new Book("Yayati123",400,"VSKhandekar",35));
		hashSet.add(new Book("MrityunjayaTheDeathConqueror123",900,"ShivajiSawant",12));
		hashSet.add(new Book("WingsOfFire123",500,"APJAbdulKalam",11));
//		System.out.println(hashSet.toString());
		Iterator<Book> itr = hashSet.iterator();
//		while(itr.hasNext()) {
//			Book ele = itr.next();
//			System.out.println(ele);
//		}		
		//Duplicate values are present in output till hashCode method not added
		while(itr.hasNext()) {
			Book ele = itr.next();
			System.out.println(ele);
		}
		// Duplicate values removed from after added hashCode() 
		//it is shown as per the order of hashCode() function
	}
}
