package com.sunbeam.que1;

public class SalesManager extends Manager{
	public SalesManager() {
		this(0,0,0);
        this.designation = "Salesmanager";
    }
	public SalesManager(int id, double sal, double bonus) {
		super();
    }
	public void accept() {
        super.accept();
    }
	public void display()
    {
        System.out.println("----------------------");
        super.display();
        System.out.println("----------------------");
    }
	@Override
	public double calcTotalSalary() {
		return super.calcTotalSalary();
	}
	
}
