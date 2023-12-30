package edu.neu.csye7374;

public class BDMDecorator extends Auto {

	public BDMDecorator(AutoAPI newAuto) {
		super(newAuto);
		// TODO Auto-generated constructor stub
	}	

	public double getPrice() {
		System.out.print("\n$4950 : Price of Blind-side Detection Monitor");
		return tempAuto.getPrice() + 5500;
	}

	public String getDescription() {
		return tempAuto.getDescription() + ", Blind-side Detection Monitor";
	}
}
