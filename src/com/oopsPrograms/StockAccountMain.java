package com.oopsPrograms;

class StockAccountMain {
	public static void createStocks(StockAccountManagement arr[]) {
		arr[0] = new StockAccountManagement("Rolex-Rings ", 100, 2000);
		arr[1] = new StockAccountManagement("Dell        ", 150, 1000);
		arr[2] = new StockAccountManagement("Tata-Steel  ", 10000, 200.80);
		arr[3] = new StockAccountManagement("Apple       ", 1000, 200000.66);
		arr[4] = new StockAccountManagement("Amazon      ", 500, 150000.99);
		arr[5] = new StockAccountManagement("Fitbit      ", 900, 5000);
		arr[6] = new StockAccountManagement("Morningstar ", 450, 2200.50);
		arr[7] = new StockAccountManagement("Zomato      ", 800, 2000.50);
		arr[8] = new StockAccountManagement("Samsung     ", 890, 102000.56);
		arr[9] = new StockAccountManagement("T-Mobiles   ", 1500, 3000.81);
	}

	public static void main(String[] args) {
		StockAccountManagement arr[] = new StockAccountManagement[10];
		createStocks(arr);
		System.out.println("Stock Name" +"       "+ "No of Shares       Share Price\n");
		for(int i=0;i<arr.length;i++) {
			arr[i].stockReport();
		}
	}

}
