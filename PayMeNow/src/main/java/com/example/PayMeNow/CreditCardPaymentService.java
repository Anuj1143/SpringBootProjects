package com.example.PayMeNow;

public class CreditCardPaymentService implements PaymentService {

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Processing Credit Card Payment...."+amount);
		
	}

	
}
