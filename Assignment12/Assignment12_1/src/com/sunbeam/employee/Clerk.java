package com.sunbeam.employee;

public class Clerk implements Emp{
	private double sal;	
	
	public Clerk() {
		this(0.0);
	}
	
	public Clerk(double sal) {
		this.sal = sal;
	}


	
	public double getSalary() {
		return this.sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	@Override
	public double getSal() {
		return this.sal;
	}	
	
}
