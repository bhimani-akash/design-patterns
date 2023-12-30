package edu.neu.csye7374;

public class StockAPI implements Tradable {
	private String name;
	private String desc;
	private double price;
	private double bid;
	private double metric;

	public StockAPI() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getBid() {
		return bid;
	}

	public void setMetric(double metric) {
		this.metric = metric;
	}

	public StockAPI(String name, String desc, double price, double metric) {
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.metric = metric;
	}

	public double getMetricDataMember(){
		return this.metric;
	}
	
	public void setBid(double bid) {
		this.bid = bid;
	};
	
	public double getMetric() {
		System.out.println(getBid()/getPrice());
		if((getBid() / getPrice()) > (1 + (getMetricDataMember() / 100))){
			setPrice(bid);
		}
		return getBid() / getPrice();
 }
	
	@Override
	public String toString() {
		return "name: "+this.name+" description: "+this.desc+" price: "+this.price;
	}
}

