package com.sunbeam.que2;

import java.util.Scanner;

public class Date implements Displayable {
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

		@Override
		public void acceptData() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter day : ");
			this.day=sc.nextInt();
			System.out.println("Enter month : ");
			this.day=sc.nextInt();
			System.out.println("Enter year : ");
			this.day=sc.nextInt();
		}
		
		@Override
		public void displayData() {
			System.out.println("Date = "+this.day+"/"+this.month+"/"+this.year);
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

		@Override
		public String toString() {
			return "Date =" + day + "/" + month + "/" + year + "]";
		}
	
}
