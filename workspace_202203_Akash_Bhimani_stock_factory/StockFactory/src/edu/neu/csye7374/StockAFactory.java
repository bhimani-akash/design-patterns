package edu.neu.csye7374;

public class StockAFactory extends AbstractStockFactory{

    @Override
    public StockAPI getStockObject(String name, String desc, double price, double metric) {
        return new StockA(name, desc, price, metric);
    }
}
