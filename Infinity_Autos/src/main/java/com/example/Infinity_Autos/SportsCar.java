package com.example.Infinity_Autos;

public class SportsCar implements Car {
	private String Owner;
	Tyre tyre;
	public SportsCar(Tyre tyre) {
		this.tyre=tyre;
	}
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return " This Sport car " +  tyre.getTyreInfo();
	}

	@Override
	public void setOwnerName(String Owner) {
		// TODO Auto-generated method stub
		this.Owner=Owner;
		
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return Owner;
	}

}
