/**
 * 
 */
package com.sunbeam.que1;

import java.util.Scanner;

public class Salesman extends Employee{
	private double comm;

		public Salesman() {
	        this.designation = "Salesman";
	        this.comm = 0.0;
	    }
		public Salesman(int id, double sal, double comm) {
			super();
	        this.comm = comm;
	    }
		public void accept(){
	        super.accept();
	        System.out.println("Enter commision : ");
	        this.comm= new Scanner(System.in).nextFloat();
	        
	    }
		public void display()
	    {
	        System.out.println("----------------------");
	        super.display();
	        System.out.println(" Commision : "+this.comm);
	    }
		public double getComm()
	    {
	        return this.comm;
	    }
		public void setComm(double comm)
	    {
	        this.comm = comm;
	    }
		@Override
		public double calcTotalSalary() {
			
			return (super.getSal()+this.getComm());
		}
		
}
