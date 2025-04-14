package com.example.Infinity_Autos;

public class NormalCar implements Car {
	 private String Owner;
	 Tyre tyre;
	 
	 public NormalCar(Tyre tyre) {
		 this.tyre=tyre;
	 }

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "This Normal Car  " + tyre.getTyreInfo();
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
