package com.sunbeam.student.comparator;

import java.util.Arrays;
import java.util.Comparator;

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		int diff = student2.getCity().compareTo(student1.getCity());
		if(diff==0) {
			diff = Double.compare(student2.getMarks(), student1.getMarks());
		if(diff==0) 
			diff = student1.getName().compareTo(student2.getName());
		}
		return diff;
	}	
}
public class TestStudent {
	
	public static void main(String[] args) {
		Student arr[]=new Student[5];
		arr[0]=new Student(101,"Nilesh","Ahmednagar",76);
		arr[1]=new Student(102,"Shiv","Pune",86);
		arr[2]=new Student(103,"Akash","Pune",86);
		arr[3]=new Student(104,"Piyush","Beed",96);
		arr[4]=new Student(105,"Sushil","Nashik",56);		
		StudentComparator scomparator = new StudentComparator();
		System.out.println("Before Sort : ");
		for (Student student : arr) {
			System.out.println(student);
		}
		Arrays.sort(arr,scomparator);
		System.out.println();
		System.out.println("After Sort by City ORDER BY descending,"
				+ "\n if City Names are same then ORDER BY Marks Descending"
				+ "\n if Marks are also same then ORDER BY Name Ascending :");
		for (Student student : arr) {
			System.out.println(student);
		}
		System.out.println();
		
	}
}
