package edu.neu.csye7374.Strategy;

public class BearStrategy implements Strategy{

	@Override
	public double calculatePrice(double oldPrice, double bidPrice) {
		// TODO Auto-generated method stub
		double newPrice;
		newPrice = ( oldPrice + (bidPrice - oldPrice) ) * 0.95;
		return newPrice;
	}
	
}
