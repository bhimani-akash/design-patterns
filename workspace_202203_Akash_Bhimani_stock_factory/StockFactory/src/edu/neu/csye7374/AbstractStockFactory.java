package edu.neu.csye7374;

public abstract class AbstractStockFactory {
	 public abstract StockAPI getStockObject(String name, String desc, double price, double metric);
}
