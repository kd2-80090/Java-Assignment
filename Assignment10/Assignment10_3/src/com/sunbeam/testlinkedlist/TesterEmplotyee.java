package com.sunbeam.testlinkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

import com.sunbeam.linkedlist.Employee;

public class TesterEmplotyee {
	static int menu() {
		System.out.println("**************************************************");
		System.out.println("0. EXIT");
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
		int choice;
		Employee emp;
		Scanner sc=new Scanner(System.in);

		List<Employee> list = new CopyOnWriteArrayList<>();
		
		while((choice=menu())!=0) {
			switch(choice) {
			case 1:		//add employee
				emp = new Employee();
				emp.accept(new Scanner(System.in));
				list.add(emp);
				break;
			case 2:		//remove employee in given list
				int empid;
			    System.out.println("Enter empid to delete  : ");
			    empid = new Scanner(System.in).nextInt();
			    Employee newEmp= new Employee();
			    newEmp.setId(empid);
			    
			    ListIterator<Employee> empListIt=list.listIterator();
			    if(list.contains(newEmp))//this will override equals method for this(because default it(equals) check for references)
			    {
			    	while(empListIt.hasNext()) 
			         {
			    		Employee empObj= empListIt.next();
			        	if(empObj.equals(newEmp))
			        	{
			        		list.remove(empObj);
					        System.out.println("Employee is deleted from the list");
			        	}
			         }
			        
			    } 
			    else 
			        System.out.println("Can't delete, Employee is not in the list");
			    break;
			case 3:		//find an employee
				int index;
				int empid3;
			    System.out.println("Enter Employee id to check if the Employee is in the list or not : ");
			    empid3 = new Scanner(System.in).nextInt();
			    Employee tempObj = new Employee();
			    tempObj.setId(empid3);
			    
				index=list.indexOf(tempObj);//getindex of employee obj
				if(index>=0) { 
					System.out.println("Employee is in the list");
					System.out.println(list.get(index));
				}
				else
					 System.out.println("Employee is not in the list");
				break;
			case 4:		//sort employee in a list
				Collections.sort(list);
				System.out.println("Employees Sorted by empid are : ");
				for(Employee empo:list) 
				{
					System.out.println(empo);
				}
				break;
			case 5:	
				System.out.println("Enter emp id to be modified: ");
				int id = sc.nextInt();
				Employee key = new Employee();
				key.setId(id);
				
				int index5 = list.indexOf(key);
				
				if(index5 == -1)
					System.out.println("Employee not found.");
				else 
				{
					Employee oldEmp = list.get(index5);
					System.out.println("Employee Found: " + oldEmp);
					
					System.out.println("Enter new information for the Employee");
					Employee newEmp5 = new Employee();
					newEmp5.accept(sc);
					list.set(index5, newEmp5);//it will replace newemp5 object it at index
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