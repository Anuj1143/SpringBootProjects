package com.example.Infinity_Autos;

public class Truck implements Car {
		private String Owner;
		Tyre tyre;
		public Truck(Tyre tyre) {
			this.tyre=tyre;
		}
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "This truck" +  tyre.getTyreInfo();
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
