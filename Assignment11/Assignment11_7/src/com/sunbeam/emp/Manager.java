package com.sunbeam.emp;


public class Manager implements Emp{
	private double basicSalary;
	private double dearanceAllowance;
	
	public Manager() {
		this(0.0,0.0);
	}
	
	public Manager(double basicSalary, double dearanceAllowance) {
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getDearanceAllowance() {
		return dearanceAllowance;
	}
	
	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}
	@Override
	public double getSal() {
		return this.basicSalary+this.dearanceAllowance;
	}
	@Override
	public double calcIncentives() {
		return 0.20*this.basicSalary;
	}
	
}
