package com.bridgelabz.oopsPrograms;

public class StockAccount {
	public int noOfShares;
	public final String stockSymbol;
	public String []temparr = new String[5];
	public String finalarr[][] = new String[20][5];
	

	public StockAccount() {
		this.stockSymbol = "";
		this.noOfShares = 0;	
		
	}
	public StockAccount(String stockSymbol,int noOfShares) {
		this.stockSymbol = stockSymbol;
		this.noOfShares = noOfShares;
		
	}
	
	public String[] buyStocks(StockAccountManagement arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].stockSymbol.equals(stockSymbol)) {
				arr[i].noOfShares -= noOfShares;
				double totalAmount = (noOfShares*arr[i].sharePrice);
				System.out.println("Total Amount of "+ arr[i].stockName + " for buying the "+noOfShares+" shares is "+totalAmount);
				temparr[0] = stockSymbol;
				temparr[1] = arr[i].stockName;
				temparr[2] = Integer.toString(noOfShares);
				temparr[3] = Double.toString(totalAmount);
				temparr[4] = "Bought";
				break;
			}
		}
		return temparr;	

	}

	public String[] sellStocks(StockAccountManagement arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].stockSymbol.equals(stockSymbol)) {
				arr[i].noOfShares += noOfShares;
				double totalAmount = (noOfShares*arr[i].sharePrice);
				System.out.println("Total Amount of "+ arr[i].stockName + " for selling the "+noOfShares+" shares is "+totalAmount);
				temparr[0] = stockSymbol;
				temparr[1] = arr[i].stockName;
				temparr[2] = Integer.toString(noOfShares);
				temparr[3] = Double.toString(totalAmount);
				temparr[4] = "Sold";
				break;
			}
		}
		return temparr;	

	}
		
		
	
	public void printReport(String finalarr[][]) {
		System.out.println("Stock symbol     Stock Name        No of shares bought      Total Amount     Action\n");
		for(int i=0; i<finalarr.length;i++) {
			if(finalarr[i][0] != null)
				System.out.println(finalarr[i][0] +"               "+finalarr[i][1]+"            "+finalarr[i][2]+ "            "+finalarr[i][3]+"        "+finalarr[i][4]);
		}
	}
	
}
