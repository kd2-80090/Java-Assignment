package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Question {

	public static void main(String[] args) {
//		Collection<String> c = new ArrayList<>();		
		//ArrayList--//Elements -> we get in order of we have added 
		
//		Collection<String> c = new HashSet<>();			
		//HashSet--//duplicate values not allowed
		//HashSet--//null value should be first 
		//HashSet--//Elements are in sorted order

//		Collection<String> c = new LinkedHashSet<>();
		//LinkedHashSet --//duplicate values not allowed
		//LinkedHashSet --//Elements -> we get in order of we have added
		
		Collection<String> c = new TreeSet<>();
		//TreeSet--//It gives NullPointerException if we have assigned any element to null
		//TreeSet--//Elements->we get it in sorted order
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
//		c.add(null);
//		c.add(null);
//		c.add(null);
		System.out.println(c.toString());
	}
}
