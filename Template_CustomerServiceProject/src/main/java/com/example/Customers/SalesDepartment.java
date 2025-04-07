package com.example.Customers;

/*
     This class is an implementation of a CustomerCare Interface based on the selection 
     in the console the department type is selected.You need to complete this class 
     based on the following tasks.

     Tasks:
       1. Override the methods of CustomerCare Interface:
       2. Build your logic for all the method based on the description given in CustomerCare Interface.
 */
public class SalesDepartment implements CustomerCare {

	private String department = "Sales Department";
	private String customerName;
	private String issue;
	private double refId;
	
	public SalesDepartment() {
		this.refId=751.0;
	}
	@Override
	public String getDepartment() {
		// TODO Auto-generated method stub
		return department;
	}
	@Override
	public void getService() {
		// TODO Auto-generated method stub
		System.out.print("Welcome"+this.issue+" you have reached the"+getDepartment()+"department");
		
	}
	@Override
	public void setCustomerName(String name) {
		// TODO Auto-generated method stub
		this.customerName=name;
		
	}
	@Override
	public void setProblem(String problem) {
		// TODO Auto-generated method stub
		this.issue=problem;
		
	}
	@Override
	public void getProblem() {
		// TODO Auto-generated method stub
		System.out.println("Dear"+this.customerName+" your issue is"+this.issue+" has been recorder , your reference Id is "+this.refId);
		
	}

}
