package edu.neu.csye7374;

public class StockBFactorySingleton extends StockBFactory{
    private static final StockBFactory myInstance = new StockBFactory();

    private StockBFactorySingleton(){}

    public static StockBFactory getMyInstance() {
        return myInstance;
    }

}