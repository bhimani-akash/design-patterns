package edu.neu.csye7374;

public class SumCommand implements Command{
	
	Calculate calculate;

	public SumCommand(Calculate calculate) {
		this.calculate = calculate;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		calculate.sum(calculate.list);
	}

}
