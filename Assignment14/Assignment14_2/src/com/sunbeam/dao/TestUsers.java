package com.sunbeam.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TestUsers {
	public static int menu() {
		System.out.println("****************** Menu ******************");
		System.out.println("0. EXIT: ");
		System.out.println("1. Add User : ");
		System.out.println("2. Display All Users : ");
		System.out.println("3. Update User Name and other things : ");
		System.out.println("4. Delete User : ");

		System.out.print("Enter your choice = ");

		int choice = new Scanner(System.in).nextInt();
		System.out.println("******************************************");

		return choice;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while((choice = menu())!=0) {
			switch(choice) {
			case 1:
			{
				try(UsersDao dao = new UsersDao()){
					Users user = new Users();
					System.out.print("First Name: ");
					user.setFirstName(sc.next());
					System.out.print("Last Name: ");
					user.setLastName(sc.next());				
					System.out.print("Email: ");
					user.setEmail(sc.next());
					System.out.print("Password: ");
					user.setPassword(sc.next());
					System.out.print("Birth Date (dd-MM-yyyy): ");
					String bdate = sc.next();
						
					Date utilDate = dao.parseDate(bdate);
					java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
					user.setDate(sqlDate);
					int cnt = dao.addUser(user);
					System.out.println("Rows inserted : "+cnt);
				}
				catch (Exception e) {
					e.printStackTrace();		
				}
				}
				break;
			case 2:
			{
				List<Users> list=new ArrayList<>();
				try(UsersDao dao=new UsersDao()){
//					List<Users> list = dao2.findAll();
//					list.forEach(c -> System.out.println(c));
					list=dao.findAll();
					for(Users user:list) {
						System.out.println(user);
					}
				} 
				catch (Exception e1) {
					e1.printStackTrace();
				}
			}
				break;
			case 3 :
				try(UsersDao dao3 = new UsersDao()){
					System.out.print("Enter user id to change :");
					int id = sc.nextInt();
					System.out.print("Enter first name :");
					String fname = sc.next();
					System.out.print("Enter last name :");
					String lname = sc.next();
					System.out.print("Enter email id :");
					String email = sc.next();
					System.out.print("Enter password :");
					String passwd = sc.next();
					System.out.print("Birth Date (dd-MM-yyyy): ");
					String bdate = sc.next();
						
					Date utilDate = dao3.parseDate(bdate);
					java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
					Date dob = sqlDate;
					System.out.print("Enter status :");
					int status = sc.nextInt();
					System.out.print("Enter role :");
					String role = sc.next();
					dao3.updateUser(new Users(id,fname,lname,email,passwd,dob,status,role));
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 4:
			{
				int cnt;
				try(UsersDao dao4=new UsersDao())
				{
					System.out.println("Enter user id to be deleted : ");	
					cnt=dao4.deleteCandidate(sc.nextInt());
					System.out.println("Total users Deleted : "+cnt);
				}
				catch (Exception e) {
					e.printStackTrace();
					}
			}
				break;
			default: 
				System.out.println("Wrong choice...:(");
					break;
			}
		}
		System.out.println("Thank you for using our application...:)");
	}
}