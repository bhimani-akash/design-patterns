package edu.neu.csye7374;

public class SubtractCommand implements Command{
	
	Calculate calculate;

	public SubtractCommand(Calculate calculate) {
		this.calculate = calculate;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		calculate.subtract(calculate.a, calculate.b);
	}

}
