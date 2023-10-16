
package com.box;

import com.sunbeam.que1.Employee;
import com.sunbeam.que1.Manager;
import com.sunbeam.que1.Salesman;

public class Tester {
	public static void main(String[] args) {
		
		
		Manager m = new Manager();
		m.accept();
		m.display();
//		Box <Manager> b1 = new Box<>();
//		b1.setT(m);
//		System.out.println("Salary of Manager : " +b1.getTotalSal());
		
//		Salesman s = new Salesman();
//		s.accept();
//		s.display();
//		Box <Salesman> b2 = new Box<>();
//		b2.setT(s);
//		System.out.println("Salary of Salesman : " +b2.getTotalSal());
		
		
		Box<Employee> b3 = new Box <>();
//		b3.setT(s);
		b3.setT(m);
//		System.out.println("Salary of Salesman : " +b3.getTotalSal());
		System.out.println("Salary of Manager : " +b3.getTotalSal());

		
		
	    
	
	}
}
