package edu.neu.csye7374.Strategy;

public class Driver {
	public static void main(String[] args) {
		Context.demo();
	}
}

/*
Output :-

Strategy Demo Function().....
------------OPERATION:Adding the stocks in the stockmarket-----------

All the stocks in the stock market

Walmart -  0.0
Costco -  0.0
------------OPERATION:Placing bids for the amazon---------------

Walmart -  129.15

Walmart -  114.0

Walmart -  134.4

Walmart -  119.69999999999999

Walmart -  129.15

Walmart -  136.5

------------OPERATION: Placing bids for costco-----------------------

Costco -  458.85

Costco -  412.29999999999995

Costco -  459.90000000000003

Costco -  406.59999999999997

Costco -  456.75

Costco -  380.0

---------TIP: Possible BUY

---------TIP: SELL

--------------------Stock Market prices to show that the prices are being updated everywhere---------
Walmart -  136.5
Costco -  380.0

*/