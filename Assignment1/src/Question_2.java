

/*

2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
doubles, supply suitable error message & terminate.
If numbers are double values, print its average
 
*/

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1 :");
		if(sc.hasNextDouble() && !sc.hasNextInt()) {
			double number1 = sc.nextDouble();
			System.out.print("Enter number 2 :");
			if(sc.hasNextDouble() && !sc.hasNextInt())
			{
				
				double number2 = sc.nextDouble();
				double avg = (number1 + number2) / 2;	
				System.out.println("Average of "+ number1+ " and "+ number2+" is "+avg);
			}
			else
				System.out.println("Enter proper decimal values as input");
			}
		else
		{
			System.out.println("Enter proper decimal values as input");
		}
	}

}
