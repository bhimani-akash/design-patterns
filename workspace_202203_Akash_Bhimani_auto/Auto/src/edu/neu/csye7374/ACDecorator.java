package edu.neu.csye7374;

public class ACDecorator extends Auto{

	public ACDecorator(AutoAPI newAuto) {	
		super(newAuto);
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		System.out.print("\n$3150 : Price of Air Conditioning");
		return tempAuto.getPrice() + 3000;
	}

	public String getDescription() {
		return tempAuto.getDescription() + ", Air Conditioning";
	}
}
