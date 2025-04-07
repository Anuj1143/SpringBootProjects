package com.example.CustomerServicedemo;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Customers.CustomerCare;

@SpringBootApplication
public class CustomerServicedemoApplication {

	public static void main(String[] args) {

		/*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.

			 Tasks:
		 *  1. Load the beans from ApplicationContext.xml
		 *  2. Display all the departments available and get the input from user.
		 *  3. Get the message from user and store it into the respective department.
		 *  
		 */
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		CustomerCare salesDepartment=context.getBean("salesDepartment", CustomerCare.class);
		CustomerCare queryDepartment= context.getBean("queryDepartment", CustomerCare.class);
		CustomerCare paymentDepartment=context.getBean("paymentDepartment", CustomerCare.class);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to customerCare Application");
		System.out.println("Please Enter your username");
		String username=sc.nextLine();
		System.out.println("Thanks for reaching us"+username);
		
		salesDepartment.setCustomerName(username);
		queryDepartment.setCustomerName(username);
		paymentDepartment.setCustomerName(username);
		
		System.out.println("Please select your department to connect to: \n1.Payment Department \n2. Query Department \n3. Sales Department");
		int choice= sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:
			paymentDepartment.getService();
			String problemPaymentDepartment = sc.nextLine();
			paymentDepartment.setProblem(problemPaymentDepartment);
			paymentDepartment.getProblem();
			break;
		
		case 2:
			queryDepartment.getService();
			String problemQueryDepartment=sc.nextLine();
			queryDepartment.setProblem(problemQueryDepartment);
			queryDepartment.getProblem();
			break;
		
		case 3:
			salesDepartment.getService();
			String problemSalesDepartment=sc.nextLine();
			salesDepartment.setProblem(problemSalesDepartment);
			salesDepartment.getProblem();
			break;
			
			
		case 0:
			System.out.println("Exiting the application");
			break;
			
		default:
			System.out.println("Invalid Choice Exiting the Application");
			break;
		
		}
		context.close();
	}
}
