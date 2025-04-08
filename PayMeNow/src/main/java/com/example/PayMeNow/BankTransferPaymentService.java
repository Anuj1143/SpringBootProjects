package com.example.PayMeNow;

public class BankTransferPaymentService implements PaymentService {

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		
		System.out.println("Processing bank Transfer Payment...."+amount);
		
	}

	

}
