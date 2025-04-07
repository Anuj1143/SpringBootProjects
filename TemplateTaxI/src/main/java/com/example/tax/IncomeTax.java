package com.example.tax;

public class IncomeTax implements Tax {
    /*
    1. Create the following attributes.
        a. taxableAmount (double)
        b. taxAmount (double)
        c. isTaxPayed (boolean)
    2. Make this class an implementation of Tax interface and override the interface methods.
    3. Using constructor initialize the isTaxPayed boolean false.
    
     */
		double taxableAmount;
		double taxAmount;
		boolean isTaxPayed;
		
		public IncomeTax() {
			isTaxPayed=false;
		}


	@Override
	public void setTaxableAmount(int amount) {
		// TODO Auto-generated method stub
		this.taxableAmount=amount;
		
		
	}

	@Override
	public void calculateTaxAmount() {
		// TODO Auto-generated method stub
		if(taxableAmount<300000) {
			taxAmount=0;
		}
		else if(taxableAmount<=600000) {
			taxAmount=taxableAmount*0.05;
		}
		else if(taxableAmount<=900000) {
			taxAmount=taxableAmount*0.1;
			
		}
		else if(taxableAmount<=120000) {
			taxAmount= taxableAmount*0.15;
			
		}
		else if(taxableAmount<=150000) {
			taxAmount=taxableAmount*0.2;
		}
		else {
			taxAmount =taxableAmount*0.3;
		}
		
	}

	@Override
	public double getTaxAmount() {
		// TODO Auto-generated method stub
		return taxAmount;
	}

	@Override
	public String getTaxType() {
		// TODO Auto-generated method stub
		return "income";
	}

	@Override
	public boolean isTaxPayed() {
		// TODO Auto-generated method stub
		return isTaxPayed;
	}

	@Override
	public void payTax() {
		// TODO Auto-generated method stub
		if(!isTaxPayed) {
			isTaxPayed=true;
			System.out.println("Hi, your income tax is paid");
			
		}
		else {
			System.out.println("Tax is already paid");
		}
		
	}
}
