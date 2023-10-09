import java.util.Scanner;

/*
 Q1. (Credit Limit Calculator)
Develop a Java application that determines whether any of several department-store customers has
exceeded the credit limit on a charge account.
For each customer,the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning
balance+ charges – credits), display the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
program should display the message "Credit limit exceeded".
 */


class CreditLimitCalculator {
	int accountno;
	int beginningBalance;
	int totalItemsCharged;
	int totalCreditAmount;
	int creditLimit;
	public CreditLimitCalculator() {
		this(0,0,0,0,0);
	}
	public CreditLimitCalculator(int accountno, int balance, int totalItemsCharged, int totalCreditAmount,
			int creditLimit) {
		this.accountno = accountno;
		this.beginningBalance = balance;
		this.totalItemsCharged = totalItemsCharged;
		this.totalCreditAmount = totalCreditAmount;
		this.creditLimit = creditLimit;
	}
	public void inputCustomersDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number = ");
		this.accountno = sc.nextInt();
		System.out.print("Enter balance = ");
		this.beginningBalance = sc.nextInt();
		System.out.print("Enter total items charged by customer this month = ");
		this.totalItemsCharged = sc.nextInt();
		System.out.print("Enter totol credit applied to the customer this month = ");
		this.totalCreditAmount = sc.nextInt();
		System.out.print("Enter credit limit of customer = ");
		this.creditLimit = sc.nextInt();
	}
	public void displayCustomersDetails() {
		System.out.println(" Account number = " + this.accountno);
		System.out.println(" Balance = "+this.beginningBalance);
		System.out.println(" Total items charged by customer this month = "+this.totalItemsCharged);
		System.out.println(" Totol credit applied to the customer this month = "+this.totalCreditAmount);
		System.out.println(" Credit limit of customer = "+this.creditLimit);
		}
	public void displayNewBalance() {
		int newBalance = this.beginningBalance + this.totalItemsCharged-this.totalCreditAmount;
		if(newBalance <this.creditLimit)
			System.out.println("Remaining or New Balance = "+newBalance);
		else
			System.out.println("Credit limit exceeded");

	}
}
public class Question_1 {
	
	public static void main(String[] args) {
		CreditLimitCalculator customer1 = new CreditLimitCalculator();
		customer1.inputCustomersDetails();
		customer1.displayNewBalance();
	}

}
