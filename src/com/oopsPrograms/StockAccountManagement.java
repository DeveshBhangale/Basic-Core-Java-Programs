package com.oopsPrograms;

public class StockAccountManagement {
	public final String stockName;
	public int noOfShares;
	public double sharePrice;
	public final String stockSymbol;
	
	public StockAccountManagement(String stockName,int noOfShares,double sharePrice,String stockSymbol) {
		this.stockName = stockName;
		this.noOfShares = noOfShares;
		this.sharePrice = sharePrice;
		this.stockSymbol = stockSymbol;
		
	}


	public void stockReport() {
		System.out.println(stockName + "     " + noOfShares+"                 " + sharePrice+ "      "+ stockSymbol);
	}

}
