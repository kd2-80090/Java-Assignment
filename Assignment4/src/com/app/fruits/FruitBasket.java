package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static int menu() {
		
		System.out.println("************************");
		System.out.println("0.Exit");
		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Display names of all fruits in basket");
		System.out.println("5.Display name,color,weight,taste of all fresh fruits,in basket");
		System.out.println("6.Display taste of all stale(not fresh) fruits in basket");
		System.out.println("7.Mark fruit as stale");
		System.out.println("8.Mark all sour fruits stale");
		System.out.println("Enter your choice = ");
		int choice = new Scanner(System.in).nextInt();
		System.out.println("***********************");
		return choice;
	}
	public static void main(String[] args) {
		int choice,counter=0;
		System.out.println("Enter basket size = ");
		int basketSize = new Scanner(System.in).nextInt();
		Fruit []basket = new Fruit[basketSize];
		
		while((choice=menu())!=0) {
			switch(choice) {
			case 1:
				if(counter<basketSize) {
				basket[counter++] = new Mango("Mango",50,"Yellow");
				System.out.println("Mangoes added");
				}
				else
					System.out.println("Basket is full...");
				break;
			case 2:
				if(counter<basketSize) {
				basket[counter++] = new Orange("Oranges",75,"Yellow-Orange");
				System.out.println("Orange added");
				}
				else
					System.out.println("Basket is full...");
				break;
			case 3:
				if(counter<basketSize) {
				basket[counter++]=new Apple("Apple",100,"Red");
				System.out.println("Apples added");
				}
				else
					System.out.println("Basket is full...");
				break;
			case 4:
//				if(basket[counter]!=null) {
//			for(int i=0;i<basket.length;i++)
//					System.out.println(basket[i].getName());
				if(counter!=0) {
					for(Fruit fruits:basket){
						if(fruits!=null){
							System.out.println(fruits.getName());
						}
					}
				}
				else
					System.out.println("Basket is empty");
				System.out.println();
	 			break;
			case 5:
				if(counter!=0) {
//				for(int i=0;i<basket.length;i++)
//					System.out.println(basket[i]);
				for(Fruit fruits:basket) 
					if(fruits!=null){
					System.out.println(fruits);
					}
				}
				else {
					System.out.println("Basket is empty");
				}
				break;
			case 6:
				if(counter!=0) {
					for(Fruit fruits:basket){
						if(fruits!=null) {
							if(!fruits.getisFresh())
							System.out.println("Stale fruit taste : "+fruits.taste());
						}
						else
							System.out.println("There are no stale fruit in the basket");
					}
				}
				else
					System.out.println("Basket is empty...");
				break;
			case 7:
				int index;
				System.out.println("Enter index to make fruit stale in the basket :");
				index = new Scanner(System.in).nextInt();
				if(index>=0 && index <basketSize) {
				if (basket[index] != null) {
					if (basket[index].getisFresh()) 
					{
						basket[index].setFresh(false);//making fruit stale
						}
						else
						System.out.println("Fruit is already stale");
				}
				else
						System.out.print("Fruits Basket is empty");
				}else 
					System.out.print("Invalid index enter correct index");
				
				break;
			case 8:
				for (Fruit fruit : basket) {
					if (fruit != null) {
						if (fruit instanceof Mango) 
						{
							Mango mango = (Mango) fruit;
							if(mango.equals("Sour Taste")){
								fruit.setFresh(false);
							}
							
						} 
						else if (fruit instanceof Apple) {
							Apple apple = (Apple) fruit;
							if(apple.equals("Sour Taste")){
								fruit.setFresh(false);
							}
						} 
						else if (fruit instanceof Orange)
							{
								Orange orange = (Orange) fruit;
								if(orange.equals("Sour Taste")){
								fruit.setFresh(false);
								}				
							}
						
						}
					}
				break;
			default:
				System.out.println("Wrong choice...:(");
				break;
			}
		}
		System.out.println("Thank you for using our app...:)");
	}

}
