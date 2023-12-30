package edu.neu.csye7374;

public class StockBFactory extends AbstractStockFactory{
	
    @Override
    public StockAPI getStockObject(String name, String desc, double price, double metric) {
        return new StockB(name,desc,price,metric);
    }
}
