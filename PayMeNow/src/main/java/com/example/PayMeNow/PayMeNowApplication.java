package com.example.PayMeNow;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class PayMeNowApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayMeNowApplication.class, args);
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		PaymentService  creditCardPayment=(PaymentService)context.getBean("creditCardPayment");
		PaymentService payPalPayment=(PaymentService)context.getBean("payPalPayment");
		PaymentService bankTransferService=(PaymentService)context.getBean("bankTransferPayment");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter payment Amount:");
		double amount=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Payment Method(Credit card, Bank Transfer, Pay pal):");
		String Method=sc.nextLine();
		PaymentService PaymentService=null;
		
		switch(Method) {
		case"CreditCard":
			PaymentService=(PaymentService) context.getBean("creditCardPayment");
			break;
		
		case"PayPal":
			PaymentService=(PaymentService)context.getBean("payPalPayment");
			break;
		case"BankTransfer":
			PaymentService=(PaymentService)context.getBean("bankTransferPayment");
			break;
		default:
			System.out.println("Invalid Payment Method");
			System.exit(0);
			
		
		}
		PaymentService.processPayment(amount);
		
		
		
	}

}
