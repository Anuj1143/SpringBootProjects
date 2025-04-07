package com.example.Customers;

/*
     This class is an implementation of a CustomerCare Interface based on the selection 
     in the console the department type is selected.You need to complete this class 
     based on the following tasks.

     Tasks:
       1. Override the methods of CustomerCare Interface:
       2. Build your logic for all the method based on the description given in CustomerCare Interface.
 */
public class QueryDepartment implements CustomerCare {
	
	private String department = "Query Department";
    private String customerName;
	private String issue;
	private double refId;
	
	public QueryDepartment() {
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
		System.out.println("Dear"+this.customerName+" your issue is "+this.issue+" has been recorded , your reference Id is"+this.refId);
		
	}
	@Override
	public void setCustomerName(String name) {
		this.customerName=name;
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setProblem(String problem) {
		this.issue=problem;
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getProblem() {
		// TODO Auto-generated method stub
		System.out.println("Dear"+this.customerName+" your issue regarding"+this.issue+" is registered with the "+getDepartment()+"."); 
	}

}
