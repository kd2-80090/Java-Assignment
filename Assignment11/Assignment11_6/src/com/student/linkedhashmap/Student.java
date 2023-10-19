package com.student.linkedhashmap;

import java.util.Scanner;

public class Student {
	private int roll;
	private String name;
	private String city;
	private double marks;
	
	public Student() {
		this(0,"","",0);
	}

	public Student(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public void acceptStudent(Student s) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll number = ");
		this.roll = sc.nextInt();
		System.out.println("Enter your name = ");
		this.name = sc.next();
		System.out.println("Enter city name = ");
		this.city = sc.next();
		System.out.println("Enter marks = ");
		this.marks = sc.nextDouble();
	}
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	
}
