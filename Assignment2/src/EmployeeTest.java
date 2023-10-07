

/*
 * Q2. Create a class called Employee that includes three fields—a first name (type String), a last
name (type String) and a monthly salary (double). Provide a constructor that initializes the three
instance variables. Provide a set and a get method for each instance variable. If the monthly salary
is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates
class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 */

class Employee {
	String firstName;
	String lastName;
	double monthlySalary;
	public Employee() {
		this("","",0.0);
	}
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		if(this.monthlySalary<0)
			System.out.println("Salary must be postive");
		this.monthlySalary = monthlySalary;
	}
	public void annualSalary() {
//		double annualSal = this.monthlySalary * 12;
		System.out.println("Annual Salary = "+this.monthlySalary*12);
	}
	public void raise() {
		this.monthlySalary += this.monthlySalary*0.1; 
		System.out.println("Annual Salary after raise = "+this.monthlySalary*12);
	}
}
public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setMonthlySalary(50000);
		employee1.annualSalary();
		employee1.raise();
		Employee employee2 = new Employee();
		employee2.setMonthlySalary(35000);
		employee2.annualSalary();
		employee2.raise();
	}

}
