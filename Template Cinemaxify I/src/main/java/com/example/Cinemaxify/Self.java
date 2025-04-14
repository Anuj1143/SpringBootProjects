package com.example.Cinemaxify;

// Override the User Interface methods in Self class
public class Self implements User{

    private String name;
    private String memberName = "self";
    private int age;
    private Long contact;
    private String address;
	@Override
	public void setUserDetails(String name, int age, Long contact, String address) {
		// TODO Auto-generated method stub
		this.name=name;
		this.age=age;
		this.contact=contact;
		this.address=address;
		
		
	}
	@Override
	public void getUserDetails() {
		// TODO Auto-generated method stub
		System.out.println("This " +this.name+"you have entered the following details of"+this.memberName+"\nage:"+this.age+"\ncontact:"+this.contact+"\naddress:"+this.address);
		
		
	}
    
    

}
