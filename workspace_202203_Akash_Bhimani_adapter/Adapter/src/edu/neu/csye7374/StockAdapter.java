package edu.neu.csye7374;

public class StockAdapter implements StockMarket {

	BearMarket market;
	
	public StockAdapter(BearMarket newMarket) {
		market = newMarket;
	}

	@Override
	public void stockPrice() {
		// TODO Auto-generated method stub
		market.bearStockPrice();
	}

	@Override
	public void stockMarketCap() {
		// TODO Auto-generated method stub
		market.bearStockMarketCap();
	}

	@Override
	public void stockDescription(String stockName) {
		// TODO Auto-generated method stub
		market.bearStockDescription(stockName);
	}
	
	public static void demo() {
		BullMarket bullMarket = new BullMarket();
		System.out.println("Bull Market");
		bullMarket.stockDescription("Apple");
		bullMarket.stockPrice();
		bullMarket.stockMarketCap();
		System.out.println();
		
		BearMarket bearMarket = new BearMarket();
		System.out.println("Bear Market");
		bearMarket.bearStockDescription("Intel");
		bearMarket.bearStockPrice();
		bearMarket.bearStockMarketCap();
		System.out.println();
		
		StockMarket stockMarket = new StockAdapter(bearMarket);
		System.out.println("Stock Adapter");
		stockMarket.stockDescription("Amazon");
		stockMarket.stockPrice();
		stockMarket.stockMarketCap();
	}
	
}