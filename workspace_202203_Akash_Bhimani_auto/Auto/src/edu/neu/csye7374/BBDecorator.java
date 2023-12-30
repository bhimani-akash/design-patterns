package edu.neu.csye7374;

public class BBDecorator extends Auto {

	public BBDecorator(AutoAPI newAuto) {
		super(newAuto);
		// TODO Auto-generated constructor stub
	}	

	public double getPrice() {
		System.out.print("\n$3333 : Price of Bumper to Bumper Warrantee");
		return tempAuto.getPrice() + 2900;
	}

	public String getDescription() {
		return tempAuto.getDescription() + ", Bumper to Bumper Warrantee";
	}
}
