


/*
 * Q3. Create a class called Date that includes three fields—a month (type int), a day (type int) and a
year (type int). Provide a constructor that initializes the three instance variables and assumes that
the values provided are correct. Provide a set and a get method for each instance
variable. Provide a method displayDate that displays the month, day and year separated by forward
slashes (/). Write a test application named DateTest that demonstrates class Date’s capabilities.
 */

class Date {
	int day;
	int month;
	int year;
	public Date() {
		this(1,1,2023);
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void displayDate() {
		System.out.println("Date = "+this.day+"/"+this.month+"/"+this.year);
	}
}
public class DateTest {

	public static void main(String[] args) {
		Date date = new Date(07,10,2023);
		date.displayDate();
	}

}
