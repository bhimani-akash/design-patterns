package edu.neu.csye7374.StockAPI;

import edu.neu.csye7374.Strategy.BearStrategy;
import edu.neu.csye7374.Strategy.BullStrategy;
import edu.neu.csye7374.Strategy.Context;

public class Walmart extends Stock {

	private double percent;

	public Walmart() {
	
	}
	
	public Walmart(double price) {
		System.out.println("Called() Walmart Constructor......");
		this.setStockName("Walmart");
		this.setStockPrice(price);
		this.setDescription("E-commerce giant");
	}

	private double getPercent() {
		return this.percent;
	}

	private void setPercent(double percentMove) {
		this.percent = percentMove;
	}
	
	@Override
	public void setBid(double bidPrice) throws Exception {
		double percentage = (((bidPrice - this.getStockPrice()) / this.getStockPrice()) * 100);
		this.setPercent(percentage);
		int MetricIdx = this.getMetric();
		if (MetricIdx > 0) {
			Context context = new Context(new BullStrategy());
			double newPrice = context.executeStrategy(this.getStockPrice(), bidPrice);
			StockMarket.getInstance().updatePrice(newPrice, this);
		} else {
			Context context = new Context(new BearStrategy());
			double newPrice = context.executeStrategy(this.getStockPrice(), bidPrice);
			StockMarket.getInstance().updatePrice(newPrice, this);
		}
	}
	
	@Override
	public int getMetric() {
		int result = 0;
		if (this.getPercent() > 0) {
			result = 100;
		} else {
			result = 0;
		}
		return result;
	}

	@Override
	public String toString() {
		return "Walmart - " + " " + this.getStockPrice();
	}
	
}
