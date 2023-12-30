package edu.neu.csye7374;

import java.text.DecimalFormat;

public class StockB extends StockAPI{

    public StockB(String name, String desc, double price, double metric) {
        super(name, desc, price, metric);
    }

    public double getMetric() {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        System.out.println("New Metric for Subclass Stock B");
        System.out.println(df.format(getBid()/getPrice()));
        if(Math.abs((getBid()/getPrice())-((getMetricDataMember()/110)))>0.5){
            setPrice(getBid());
        }
        return getBid()/getPrice();
    }
}