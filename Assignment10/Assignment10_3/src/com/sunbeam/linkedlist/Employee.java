package com.sunbeam.linkedlist;

import java.util.Objects;
import java.util.Scanner;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double sal;
	protected String designation;

	public Employee() {
	     this(0,"",0);
	}
	public Employee(int id, String name, double sal) {
        this.id = id;
        this.name=name;
        this.sal = sal;
	}
	public void accept(Scanner sc) {
        System.out.println("Enter Employee id : ");
        this.id= sc.nextInt();
        System.out.println("Enter name : ");
        this.name=sc.next();
        System.out.println("Enter salary : ");
        this.sal= sc.nextDouble();
    }
    public void display() {
        System.out.println(" Employee ID : "+this.id);
        System.out.println(" Emp Name : "+this.name);
        System.out.println(" Salary : "+this.sal);
//        System.out.println(" Designation :"+this.getDesignation());
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSal() {
        return this.sal;
    }
    public void setSal(int sal) {
        this.sal = sal;
    }
    public String getDesignation() {
        return "Employee";
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Employee) {
			Employee other = (Employee) obj;
			if(this.id == other.id)
				return true;
		}
		return false;		
	}
	@Override
	public int compareTo(Employee obj) {
		int diff = Integer.compare(this.id, obj.id);
		return diff;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
    
}
