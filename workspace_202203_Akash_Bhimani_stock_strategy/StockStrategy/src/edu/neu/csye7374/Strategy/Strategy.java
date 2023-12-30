package edu.neu.csye7374.Strategy;

@FunctionalInterface
public interface Strategy {
	public double calculatePrice(double oldPrice, double bidPrice);
}
