package com.oopsPrograms;

public class StockAccountManagement {
	public final String stockName;
	public int noOfShares;
	public double sharePrice;
	
	public StockAccountManagement(String stockName,int noOfShares,double sharePrice) {
		this.stockName = stockName;
		this.noOfShares = noOfShares;
		this.sharePrice = sharePrice;
	}
	
	public void stockReport() {
		System.out.println(stockName + "     " + noOfShares+"                 " + sharePrice);
	}

}
