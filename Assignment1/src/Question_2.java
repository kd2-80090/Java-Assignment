

/*

2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
doubles, supply suitable error message & terminate.
If numbers are double values, print its average
 
*/

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter value 1:");
//		double number1 = sc.nextDouble();
//		System.out.print("Enter value 2:");
//		double number2 = sc.nextDouble();
		
//		double avg = (number1 + number2)/2;
		if(sc.hasNextDouble() && !sc.hasNextInt())
//			System.out.println("Average of "+ number1+ " and "+ number2+" is ");
		else
			System.out.println("Enter proper double values as input");
	}

}
