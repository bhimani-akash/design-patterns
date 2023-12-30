package edu.neu.csye7374;

import java.text.DecimalFormat;

public class StockA extends StockAPI implements Tradable{

  public StockA (String name, String desc, double price, double metric) {
      super(name, desc, price, metric);
  }


  public double getMetric() {
      DecimalFormat df = new DecimalFormat();
      df.setMaximumFractionDigits(2);
      
      System.out.println("New Metric for subclass Stock A");
      System.out.println(df.format(getBid() / getPrice()));
      
      if((getBid() / getPrice()) > (1 + (getMetricDataMember() / 100))){
          setPrice(getBid());
      }
      
      return getBid() / getPrice();
  }
}