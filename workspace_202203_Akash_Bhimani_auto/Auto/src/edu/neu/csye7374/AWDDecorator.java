package edu.neu.csye7374;

public class AWDDecorator extends Auto {

	public AWDDecorator(AutoAPI newAuto) {
		super(newAuto);
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		System.out.print("\n$2660 : Price of All Wheel Drive");
		return tempAuto.getPrice() + 2500;
	}

	public String getDescription() {
		return tempAuto.getDescription() + ", All Wheel Drive";
	}
}
