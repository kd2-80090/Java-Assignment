


/*
3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit.
 * */

import java.util.Scanner;
public class Question_3 {
	static int menu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("********************");
		System.out.println("1. Add Dosa");
		System.out.println("2. Add Samosa");
		System.out.println("3. Add Idli");
		System.out.println("4. Add Uttapa");
		System.out.println("5. Add Poha");
		System.out.println("6. Add Upma");
		System.out.println("7. Add Bhaji Pav");
		System.out.println("8. Add Vada Pav");
		System.out.println("9. Add Patis");
		System.out.println("10. Generate Bill");
		System.out.println("0. Exit");
		System.out.print("Enter your choice = ");
		choice = sc.nextInt();
		System.out.println("********************");
		return choice;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int tot=0;
		while((choice = menu())!=0){
			switch(choice) {
			case 1:
				int dosa = 40;
				System.out.print("Please enter quantity = " );
				int q1=sc.nextInt();
				tot+=dosa*q1;
				System.out.println(q1+" Dosa added...");
				break;
			case 2:
				int samosa = 20;
				System.out.print("Please enter quantity = " );
				int q2=sc.nextInt();
				tot+=samosa*q2;
				System.out.println(q2+" Samosa added...");
				break;
			case 3:
				int idli = 35;
				System.out.print("Please enter quantity = " );
				int q3=sc.nextInt();
				tot+=idli*q3;
				System.out.println(q3+" Idli added...");
				break;
			case 4:
				int uttapa = 40;
				System.out.print("Please enter quantity = " );
				int q4=sc.nextInt();
				tot+=uttapa*q4;
				System.out.println(q4+" Uttapa added...");
				break;
			case 5:
				int poha = 20;
				System.out.print("Please enter quantity = " );
				int q5=sc.nextInt();
				tot+=poha*q5;
				System.out.println(q5+" Poha added...");
				break;
			case 6:
				int upma = 20;
				System.out.print("Please enter quantity = " );
				int q6=sc.nextInt();
				tot+=upma*q6;
				System.out.println(q6+" Upma added...");
				break;
			case 7:
//				int bhajiPav = 25;
				System.out.print("Please enter quantity = " );
				int q7=sc.nextInt();
				tot+=25*q7;
				System.out.println(q7+" bhajiPav added...");
				break;
			case 8:
				int vadaPav = 15;
				System.out.print("Please enter quantity = " );
				int q8=sc.nextInt();
				tot+=vadaPav*q8;
				System.out.println(q8+" VadaPav added...");
				break;
			case 9:
				int patis = 20;
				System.out.print("Please enter quantity = " );
				int q9=sc.nextInt();
				tot+=patis*q9;
				System.out.println(q9+" Patis added...");
				break;
			case 10:
				System.out.println("Total bill = "+tot);
				break;
				
			default:
				System.out.println("Wrong choice...:(");
				break;
					
			}
		}
		System.out.println("Thank you...:)\n*********************\nPlease visit again...");
	}

}