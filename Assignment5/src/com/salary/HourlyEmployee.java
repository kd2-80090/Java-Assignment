package com.salary;

public class HourlyEmployee extends Employee {
	
	private double hourlyWage;
	private int hours;
	public HourlyEmployee(String firstName, String lastName, int socialSecurityNumber, double hourlyWage,int hours) {
		super(firstName,lastName,socialSecurityNumber);
		this.hourlyWage = hourlyWage;
		this.hours = hours;
	}
	public HourlyEmployee() {

	}
	@Override
	public String toString() {
		return  super.toString()+" Hourly Wage=" + hourlyWage + ", Working Hours=" + hours  + "]";
	}
	public double getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public void hourlySalary() {
		if( this.hours <=40 )
			System.out.println("Earning of Hourly Salary Employee = "+this.hourlyWage*this.hours);
		else if(this.hours>40) {
			System.out.println("Earning of Hourly Salary Employee = "+ (40*this.hourlyWage+(this.hours - 40)*this.hourlyWage*1.5));
		}
	}
}
