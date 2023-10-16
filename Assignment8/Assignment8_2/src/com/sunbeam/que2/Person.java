package com.sunbeam.que2;

import java.util.Scanner;

public class Person implements Displayable{
	private String name;
	private int age;
	public Person() {
		this("",18);
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		this.name=sc.next();
		System.out.println("Enter age : ");
		this.age=sc.nextInt();
	}
	@Override
	public void displayData() {
		System.out.println(" Name : "+this.name);
		System.out.println(" Age : "+this.age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [Name=" + name + ", Age=" + age + "]";
	}
	
}
