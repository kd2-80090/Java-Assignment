package com.test;

import com.sunbeam.emp.*;

public class TesterEmp {
	public static void main(String[] args) {
		Emp[] arr = new Emp[3]; 
		arr[0]=new Manager(5000.0,500.0);
		arr[1]=new Clerk(3000.0);
		arr[2]=new Labor(350.0,100.0);
			
		double totalIncome = Emp.calcTotalIncome(arr);
		System.out.println(totalIncome);
		
	}
}
	

