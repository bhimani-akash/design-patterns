package edu.neu.csye7374;

public class BatchCalculator {

	Command button;
	
	public BatchCalculator(Command button) {
		this.button = button;
	}
	
	public void invoke() {
		button.execute();
	}
}
