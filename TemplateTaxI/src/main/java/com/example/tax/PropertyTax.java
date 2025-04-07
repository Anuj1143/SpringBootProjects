package com.example.tax;

public class PropertyTax implements Tax {
	double taxableAmount;
	double taxAmount;
	boolean isTaxPayed;
	public PropertyTax() {
		isTaxPayed=false;
	}

	@Override
	public void setTaxableAmount(int amount) {
		this.taxableAmount=amount;
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void calculateTaxAmount() {
		taxAmount=taxableAmount*0.05;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getTaxAmount() {
		// TODO Auto-generated method stub
		return taxAmount;
	}

	@Override
	public String getTaxType() {
		// TODO Auto-generated method stub
		return "property";
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
			System.out.println("Hi, your property tax is paid");
		}
		else {
			System.out.print("Tax is Already paid");
		}
		
	}
    /*
    1. Create the following attributes.
        a. taxableAmount (double)
        b. taxAmount (double)
        c. isTaxPayed (boolean)
    2. Make this class an implementation of Tax interface and override the interface methods.
    3. Using constructor initialize the isTaxPayed boolean false.
     */
}
