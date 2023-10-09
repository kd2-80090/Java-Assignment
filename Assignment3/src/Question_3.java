import java.util.Scanner;

/*
 Q3. Create an application that calculates your daily driving cost, so that you can estimate how much
money could be saved by car pooling, which also has other advantages such as reducing carbon
emissions and reducing traffic congestion. The application should input the following information
and display the user’s cost per day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day.
 */

class DrivingCost {
	float miles;
	double costOfGas;
	float average;
	double parkingFees;
	double totalToll;
	public DrivingCost() {
		
	}
	public DrivingCost(float miles, double costOfGas, float average, double parkingFees, double totalToll) {
		this.miles = miles;
		this.costOfGas = costOfGas;
		this.average = average;
		this.parkingFees = parkingFees;
		this.totalToll = totalToll;
	}
	public void inputDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total miles driven per day = ");
		this.miles = sc.nextFloat();
		System.out.print("Enter cost per gallon of Gasoline = ");
		this.costOfGas = sc.nextDouble();
		System.out.print("Enter average miles per gallon = ");
		this.average = sc.nextFloat();
		System.out.print("Enter Parking fees per day = ");
		this.parkingFees = sc.nextDouble();
		System.out.print("Enter tolls per day = ");
		this.totalToll = sc.nextDouble();
	}
	public void displayDetails() {
		System.out.println(" Total miles driven per day = " + this.miles);
		System.out.println(" Cost per gallon of Gasoline = "+this.costOfGas);
		System.out.println(" Average miles per gallon = "+this.average);
		System.out.println(" Parking fees per day = "+this.parkingFees);
		System.out.println(" Tolls per day = "+this.totalToll);
		}
	public void getDailyDrivingCost() {
		double dailyCost;
		dailyCost = ((this.miles/this.average)*this.costOfGas) + this.parkingFees + this.totalToll;
		System.out.println("Daily Driving Cost = "+dailyCost);
	}
}

public class Question_3 {

	public static void main(String[] args) {
		DrivingCost car1 = new DrivingCost();
		car1.inputDetails();
		car1.getDailyDrivingCost();
	}

}
