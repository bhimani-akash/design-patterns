package edu.neu.csye7374;

public class StockAFactorySingleton extends StockAFactory {

    private static StockAFactory myInstance;

    private StockAFactorySingleton() {
        myInstance=null;
    }

    public static StockAFactory getInstance() {
        if(myInstance == null) {
            myInstance = new StockAFactory();
        }
        return myInstance;
    }
}
