package com.example.Cinemaxify;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

// 1. Beginner Code Template is already provided to you.
// 2. Just follow the below task to complete the execution of main application.
@SpringBootApplication
public class CinemaxifyApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Cinemaxify Application");
		System.out.println("Please select the member you want the plan for:");
		System.out.println("1. Self\n2. Spouse\n3 Exit");
		
		int userChoice = scanner.nextInt();
		scanner.nextLine();
		
		User user=null;
		switch (userChoice) {
		  case 1 -> user =context.getBean("self",User.class);
			  
			  
			  
		  
		  case 2 -> user=context.getBean("spouse",User.class);
			  // b. Set userType according to the userChoice.
			  
		  
		  case 3 -> {
			  // c. Print "Exiting..." and return
			  System.out.println("Exiting.....");
			  return;
				    }
		  default -> {
			  // d. Print "Invalid choice." and return.
			  System.out.println("Invalid Choice");
			  return;

				     }
		}
		// e. Pick the user bean using context.getBean().
		// a. Set userType according to the userChoice.
		if(user!=null) {
			System.out.println("Please Enter your name:");
			  String name=scanner.nextLine();
			  System.out.println("Please Enter your age:");
			  int age=scanner.nextInt();
			  System.out.println("Please Enter your contact:");
			  long contact=scanner.nextLong();
			  scanner.nextLine();
			  System.out.println("Please Enter Your Address");
			  String address=scanner.nextLine();
			  
			  user.setUserDetails(name, age, contact, address);
			  user.getUserDetails();
			 
			
		}
		  
			scanner.close();
			context.close();
		  
		  
		// f. Take input for User details i.e. name , age, address etc.

		// g. Set the above fetched details into the user by using appropriate method.

		// h. finally print the details by using appropriate method.
			}
	}