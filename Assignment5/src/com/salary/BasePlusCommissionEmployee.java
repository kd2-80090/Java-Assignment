package com.salary;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;
	public BasePlusCommissionEmployee(String firstName, String lastName, int socialSecurityNumber, int grossSales, double commisionRate,double baseSalary) {
		super(firstName,lastName,socialSecurityNumber,grossSales,commisionRate);
		this.baseSalary = baseSalary;
	}
	public BasePlusCommissionEmployee() {

	}
	@Override
	public String toString() {
		return super.toString()+" Base Salary=" + baseSalary + "]";
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public void basePlusCommissionSalary() {
		System.out.println("Earning of base salary Plus Commission = "+((getCommisionRate()*getGrossSales())+this.baseSalary));
	}
}
