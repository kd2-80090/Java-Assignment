package com.test;

import com.sunbeam.que2.Date;
import com.sunbeam.que2.Displayable;
import com.sunbeam.que2.Person;

public class Tester {
	
	
	public static void printDisplayableBox(Box <? extends Displayable>b) {
		b.getT().displayData();
	}
	public static void printBox(Box <?>b) {
		System.out.println(b.getT().toString());
	}
	public static void main(String[] args) {
		Box<Person>b1= new Box<>();
		b1.setT(new Person("Nilesh",20));
//		printDisplayableBox(b1);	//internally calls Person.show()
		
		Box<Date>b2= new Box<>();
		b2.setT(new Date(1,1,2023));
//		printDisplayableBox(b2);	//internally calls Date.show()

		Box<String>b3= new Box<>();
		b3.setT(new String("hello"));
//		printDisplayableBox(b3);	//compiler error

		printBox(b3);
		printBox(b2);	//internally calls Date.show()
		printBox(b1);	//internally calls Person.show()

	
	}
}
