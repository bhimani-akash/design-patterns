package edu.neu.csye7374.StockAPI;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
	private List<Stock> stocks;

	private static StockMarket instance;

	private StockMarket() {
		stocks = new ArrayList<>();
	}

	public static StockMarket getInstance() {
		if (instance == null) {
			instance = new StockMarket();
		}
		return instance;
	}
	
	public void addStock(Stock stk) throws Exception {
		if (!stocks.contains(stk)) {
			stocks.add(stk);
		} else {
			throw new Exception("Stock already exists");
		}
	}
	
	public void updatePrice(double newPrice, Stock stk) throws Exception {
		if (stocks.contains(stk)) {
			stk.setStockPrice(newPrice);
		} else {
			throw new Exception("No such stock exists!!");
		}
	}
	
	public void removeStock(Stock stk) throws Exception {
		if (stocks.contains(stk)) {
			stocks.remove(stk);
		} else {
			throw new Exception("No such stock exists!!");
		}
	}
	
	public Stock getStock(String name) throws Exception {
		Stock stock = null;
		for (Stock s : stocks) {
			if (s.getStockName().equalsIgnoreCase(name)) {
				stock = s;
			}
		}
		if (stock == null) {
			throw new Exception("No such stock exists!!");
		}
		return stock;
	}
	
	public void displayAllStocks() throws Exception {
		if (stocks.size() != 0) {
			for (Stock s : stocks) {
				if (s instanceof Walmart) {
					s = (Walmart) s;
					System.out.println(s.toString());
				} else if (s instanceof Costco) {
					s = (Costco) s;
					System.out.println(s.toString());
				}
			}
		} else {
			throw new Exception("No stocks to be displayed");
		}
	}
}
