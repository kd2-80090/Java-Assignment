import java.util.Scanner;

/*
 * Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.
 */

class Invoice {
	Scanner sc = new Scanner(System.in);
	String partNumber;
	String partDescription;
	int quantity;
	double price;
	
	public Invoice() {
		this("","",0,0.0);
//		System.out.println("Inside default");
	}
	public Invoice(String partNumber, String partDescription, int quantity, double price) {
//		System.out.println("Inside parameterized");
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		if(this.quantity<0)
			this.quantity=0;
		else
			this.quantity = quantity;
		if(this.price<0)
			this.price=0;
		else
			this.price = price;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void accept() {
		System.out.println("Enter part number = ");
		this.partNumber = sc.next();
		System.out.println("Enter part description = ");
		this.partDescription = sc.next();
		System.out.println("Enter quantity  = ");
		this.quantity = sc.nextInt();
		if(this.quantity<0)
			this.quantity=0;
		System.out.println("Enter price = ");
		this.price = sc.nextDouble();
		if(this.price<0)
			this.price=0;
	}
	public void display() {
		System.out.println("Part number :	"+this.partNumber);
		System.out.println("Part description :	"+this.partDescription);
//		if(this.quantity<0) {
//			this.quantity=0;
//			System.out.println("Quantity		:	"+this.quantity);
//		}
//		else
		System.out.println("Quantity	:	"+this.quantity);
//		if(this.price<0) {
//			this.price=0.0;
//			System.out.println("Price		:	"+this.price);
//		}
//		else
		System.out.println("Price		:	"+this.price);
	}
	public void calculateInvoiceAmount() {
		double totPrice;
		totPrice = this.price * this.quantity;
		System.out.println("Total Amount to pay = "+totPrice);
	}
}
public class InvoiceTest {

	public static void main(String[] args) {
//		Invoice bill1 = new Invoice();
		
//		bill1.accept();
//		bill1.calculateInvoiceAmount();
		Invoice bill = new Invoice();
		bill.accept();
		bill.display();
		bill.calculateInvoiceAmount();
	}

}
