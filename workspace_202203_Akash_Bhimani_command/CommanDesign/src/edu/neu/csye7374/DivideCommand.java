package edu.neu.csye7374;

public class DivideCommand implements Command{
	
	Calculate calculate;

	public DivideCommand(Calculate calculate) {
		this.calculate = calculate;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		calculate.divide(calculate.a, calculate.b);
	}

}
