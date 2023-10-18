package com.sunbeam.testlinkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.linkedlist.Employee;

public class TesterEmplotyee {
	static int menu() {
		System.out.println("**************************************************");
		System.out.println("0.EXIT");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee in a list");
		System.out.println("3. Find Employee in a list");
		System.out.println("4. Sort Employees in a list");
		System.out.println("5. Edit Employee");
		System.out.println("Enter your choice = ");
		int choice = new Scanner(System.in).nextInt();
		System.out.println("**************************************************");
		return choice;
	}
	
	public static void main(String[] args) {
		List <Employee> list = new LinkedList<>();
		Employee emp;
		Scanner sc;
		int choice;
		int index=0;
		while((choice=menu())!=0) {
			switch(choice) {
			case 1:		//add employee
				emp = new Employee();
				emp.accept(new Scanner(System.in));
				list.add(emp);
				index++;
				break;
			case 2:		//remove employee in given list
//				for(int i=0;i<list.size();i++) {
//					System.out.println(list.get(i));
//				}
				System.out.println("Enter employee id which to delete from a list : ");
				Integer id=new Scanner(System.in).nextInt();
				Employee value = new Employee();
				value.setId(id);
				int check = list.indexOf(value.getId());
				list.remove(check);
				System.out.println("-----------------------");
				System.out.println("Deleted Successfully");
				break;
			case 3:		//find an employee
				System.out.println("Enter Employee id to get details :");
				Integer id1 = new Scanner(System.in).nextInt();
				Employee key = new Employee();
				
				key.setId(id1);
				if(list.contains(key))
					System.out.println("Employee Details are : \n"+key);
				else
					System.out.println("Employee Not Found");
				break;
			case 4:		//sort employee in a list
				System.out.println("Enter index at which element to be deleted: ");
				index=new Scanner(System.in).nextInt();
//				Collections.sort((List<T>list);
				System.out.println("-----------------------");
				System.out.println("Deleted Successfully");
				break;
			case 5:	
				System.out.println("Enter emp id to be modified: ");
				int id3 = new Scanner(System.in).nextInt();
				Employee key1 = new Employee();
				key1.setId(id3);
				int index1 = list.indexOf(key1);
				if(index == -1)
				System.out.println("Employee not found.");
				else {
				Employee oldEmp = list.get(index1);
				System.out.println("Employee Found: " + oldEmp);
				System.out.println("Enter new information for the Employee");
				Employee newEmp = new Employee();
				newEmp.accept(new Scanner(System.in));
				list.set(index, newEmp);
				}
				break;
			case 6:
				for(int i=0;i<list.size();i++) {
					System.out.println(list.get(i));
				}
				break;
			default:
				System.out.println("Wrong Choice...:(");
				break;
			}
		}
		System.out.println("Thank you for using our app...:)");

	}
}