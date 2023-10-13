package com.test;

import com.salary.BasePlusCommissionEmployee;
import com.salary.CommissionEmployee;
import com.salary.Employee;
import com.salary.HourlyEmployee;
import com.salary.SalariedEmployee;

public class Tester {
	
	public static void main(String[] args) {
		Employee employee = new SalariedEmployee("Nilesh","Katkar",1234,50000);
		SalariedEmployee salariedEmployee = (SalariedEmployee) employee;
		salariedEmployee.weeklySalary();
		Employee employee1 = new HourlyEmployee("Nilesh","Katkar",1234,2000,35);	//upcasting
		HourlyEmployee hourlyEmployee = (HourlyEmployee) employee1;		//downcasting
		hourlyEmployee.hourlySalary();
		Employee employee2 = new CommissionEmployee("Chetan","Dada",521,450,100);
		CommissionEmployee commissionEmployee = (CommissionEmployee) employee2;
		commissionEmployee.commissionSales();
		Employee employee3= new BasePlusCommissionEmployee("Nilesh","Katkar",1234,40,2000,50000);
		BasePlusCommissionEmployee basePlusCommissionEmployee = (BasePlusCommissionEmployee)employee3;
		basePlusCommissionEmployee.basePlusCommissionSalary();
		}
}
