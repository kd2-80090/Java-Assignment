package com.salary;

public class CommissionEmployee extends Employee{
	private int grossSales;
	private double commisionRate;
	
	public CommissionEmployee(String firstName, String lastName, int socialSecurityNumber, int grossSales, double commisionRate) {
		super(firstName,lastName,socialSecurityNumber);
		this.grossSales = grossSales;
		this.commisionRate = commisionRate;
	}
	public CommissionEmployee() {

	}
	@Override
	public String toString() {
		return super.toString()+" Gross Sales=" + grossSales + ", Commision Rate=" + commisionRate  + "]";
	}
	public int getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommisionRate() {
		return commisionRate;
	}
	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}
	public void commissionSales() {
		System.out.println("Earning of Commission - Employee  = "+this.commisionRate*this.grossSales);
	}
	
}

