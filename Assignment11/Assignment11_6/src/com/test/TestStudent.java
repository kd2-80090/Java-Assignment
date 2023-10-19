package com.test;

import com.student.linkedhashmap.*;
import java.util.*;
import java.util.Map.Entry;

public class TestStudent {
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("***********************");
		System.out.println("0. EXIT");
		System.out.println("1. Add Student.");
		System.out.println("2. Search student.");
		System.out.println("3. Display all Students.");		
		System.out.println("Enter your choice = ");
		int choice = sc.nextInt();
		System.out.println("***********************");
		return choice;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		Map<Integer, Student> map = new HashMap<>();
		while((choice=menu())!=0) {
			switch(choice) {
			case 1: //insert in map
				Student s = new Student();
				s.acceptStudent(s);
				map.put(s.getRoll(), s);	// accept book from user
				System.out.println("---------------------------");
				System.out.println(" Student added successfully.");
				break;
			case 2: //find in map
				System.out.println("Enter student roll no to find in list : ");
				Integer roll = sc.nextInt();
				if(map.get(roll)!=null) {
				Student student = map.get(roll);
				System.out.println("Student found : "+student);
				}
				else 
					System.out.println("Student not found.");
				break;
			case 3:
				Set <Entry<Integer, Student>>entry=map.entrySet();
				for (Entry<Integer, Student> loop : entry) {
					System.out.println(loop);
				}
				break;
			default:
				System.out.println("Wrong choice...:(");
				break;
			}
		}
		System.out.println("Thank you for using our app...:)");
	}
}
