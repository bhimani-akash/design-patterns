package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
	List<Tradable> stocks;
	private static StockMarket myInstance = null;
	
	private StockMarket() {
		stocks = new ArrayList<Tradable>();
	}
	public static StockMarket getInstance() {
		if(myInstance == null) {
			myInstance = new StockMarket();
		}
		return myInstance;
	}
	
	public void addStock(Tradable stock) {
		stocks.add(stock);
	}
	
	public void tradeStock(Tradable stock) {
		stock.getMetric();
	}

	public void removeStock(Tradable stock) {
		stocks.remove(stock);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Tradable stock: stocks) {
			sb.append(stock.toString());
			sb.append("\n");
		}
		return sb.toString();
	}

	public static void demo(){
		StockMarket nasdaq = StockMarket.getInstance();
		
		StockAFactory aFactory = StockAFactorySingleton.getInstance();
		StockBFactory bFactory = StockBFactorySingleton.getMyInstance();
		
		StockAPI walmartStock = aFactory.getStockObject("Walmart", "Walmart common stock", 124, 15);
		nasdaq.addStock(walmartStock);
		StockAPI costcoStock = bFactory.getStockObject("Costco", "Costco common stock", 437, 10);
		nasdaq.addStock(costcoStock);
		
		System.out.println("================ Bids for Stock A ================ ");
		
		System.out.println("Bid 1");
		walmartStock.setBid(123);
		nasdaq.tradeStock(walmartStock);
		System.out.print(nasdaq);

		System.out.println("Bid 2");
		walmartStock.setBid(120);
		nasdaq.tradeStock(walmartStock);
		System.out.print(nasdaq);

		System.out.println("Bid 3");
		walmartStock.setBid(128);
		nasdaq.tradeStock(walmartStock);
		System.out.print(nasdaq);

		System.out.println("Bid 4");
		walmartStock.setBid(126);
		nasdaq.tradeStock(walmartStock);
		System.out.print(nasdaq);

		System.out.println("Bid 5");
		walmartStock.setBid(123);
		nasdaq.tradeStock(walmartStock);
		System.out.print(nasdaq);

		System.out.println("Bid 6");
		walmartStock.setBid(130);
		nasdaq.tradeStock(walmartStock);
		System.out.print(nasdaq);

		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("================ Bids for Stock B ================ ");
		
		System.out.println("Bid 1");
		costcoStock.setBid(437);
		nasdaq.tradeStock(costcoStock);
		System.out.print(nasdaq);
		
		System.out.println("Bid 2");
		costcoStock.setBid(434);
		nasdaq.tradeStock(costcoStock);
		System.out.print(nasdaq);
		
		System.out.println("Bid 3");
		costcoStock.setBid(438);
		nasdaq.tradeStock(costcoStock);
		System.out.print(nasdaq);

		System.out.println("Bid 4");
		costcoStock.setBid(428);
		nasdaq.tradeStock(costcoStock);
		System.out.print(nasdaq);
		
		System.out.println("Bid 5");
		costcoStock.setBid(435);
		nasdaq.tradeStock(costcoStock);
		System.out.print(nasdaq);
		
		System.out.println("Bid 6");
		costcoStock.setBid(400);
		nasdaq.tradeStock(costcoStock);
		System.out.print(nasdaq);
	}
}
