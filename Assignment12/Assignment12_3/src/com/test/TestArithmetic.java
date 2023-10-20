package com.test;

import java.util.Scanner;

import com.functionalprogramming.Arithmetic;

public class TestArithmetic {
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
	}
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*********** CALCULATOR ************");
		System.out.println("0. EXIT");
		System.out.println("1. Addition.");
		System.out.println("2. Subtraction.");
		System.out.println("3. Multiplication.");
		System.out.println("4. Division.");
		System.out.println("Enter your choice = ");
		int choice = sc.nextInt();
		System.out.println("***********************************");
		return choice;
	}
	public static void main(String[] args) {
		int choice;
		Scanner sc =  new Scanner(System.in);
		while((choice=menu())!=0) {
			switch(choice) {
			case 1: 
				System.out.println("Enter two numbers = ");
				Double a = sc.nextDouble();
				Double b = sc.nextDouble();
				calculate(a, b, (x,y)-> x+y);
				break;
			case 2: 
				System.out.println("Enter two numbers = ");
				Double i = sc.nextDouble();
				Double j = sc.nextDouble();
				calculate(i, j, (x,y)-> x-y);
				break;
			case 3: 
				System.out.println("Enter two numbers = ");
				Double p = sc.nextDouble();
				Double q = sc.nextDouble();
				calculate(p, q, (x,y)-> x*y);
				break;
			case 4: 
				System.out.println("Enter two numbers = ");
				Double l = sc.nextDouble();
				Double m = sc.nextDouble();
				calculate(l, m, (x,y)-> x/y);
				break;
			default:
				System.out.println("Wrong choice...:(");
				break;
			}
		}
		System.out.println("Thank you for using our app...:)");
	}
}
