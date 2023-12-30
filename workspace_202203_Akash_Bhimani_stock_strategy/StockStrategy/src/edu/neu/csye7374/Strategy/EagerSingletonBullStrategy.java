package edu.neu.csye7374.Strategy;

public class EagerSingletonBullStrategy implements Strategy {

	private static final EagerSingletonBullStrategy instance = new EagerSingletonBullStrategy();
	
	private EagerSingletonBullStrategy() {
		
	}
	
	public static EagerSingletonBullStrategy getInstance() {
		return instance;
	}
	
	@Override
	public double calculatePrice(double oldPrice, double bidPrice) {
		// TODO Auto-generated method stub
		double newPrice;
		newPrice = ( oldPrice + (bidPrice - oldPrice) ) * 1.05;
		return newPrice;
	}

}
