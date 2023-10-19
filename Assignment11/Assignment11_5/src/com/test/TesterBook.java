package com.test;

import java.util.*;
import com.sunbeam.hashset.*;

public class TesterBook {
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		int choice = sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		Map<String,Book> hashMap = new HashMap<>();
		Book book;
		hashMap.put("3key",new Book("WingsOfFire123",900,"APJAbdulKalam",12));
		hashMap.put("2key",new Book("ImmortalsOfMeluha123",250,"Amish",25));
		hashMap.put("4key",new Book("Yayati123",400,"VSKhandekar",35));
		hashMap.put("1key",new Book("MrityunjayaTheDeathConqueror123",900,"ShivajiSawant",12));
		hashMap.put("3key",new Book("WingsOfFire123",500,"APJAbdulKalam",11));
		hashMap.get(hashMap);

	}
}
