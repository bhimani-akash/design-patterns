package edu.neu.csye7374.StockAPI;

public class Stock implements Tradable {

	private String stockName;
	private double stockPrice = 0.00;
	private String description;
	
	public Stock() {
		
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String name) {
		stockName = name;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double price) {
		stockPrice = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Stock [StockName=" + stockName + ", StockPrice=" + stockPrice + ", description=" + description + "]";
	}

	@Override
	public void setBid(double bid) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public int getMetric() {
		// TODO Auto-generated method stub
		return 0;
	}

}
