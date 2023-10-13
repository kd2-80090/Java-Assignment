package com.salary;

public class SalariedEmployee extends Employee{
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, int socialSecurityNumber, double weeklySalary) {
		super(firstName,lastName,socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}
	
	public SalariedEmployee() {

	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public String toString() {
		return super.toString()+" Weekly Salary=" + weeklySalary + "]";
	}
	public void weeklySalary() {
		System.out.println("Earning of Salaried Employee = "+this.weeklySalary);
	}
}
