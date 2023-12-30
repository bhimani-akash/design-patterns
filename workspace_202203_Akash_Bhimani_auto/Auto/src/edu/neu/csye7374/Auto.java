package edu.neu.csye7374;

public class Auto implements AutoAPI {

	protected AutoAPI tempAuto;
	
	public Auto(AutoAPI newAuto) {
		tempAuto = newAuto;
	}
	
	public double getPrice() {
		return tempAuto.getPrice();
	}

	public String getDescription() {
		return tempAuto.getDescription();
	}

}
