package com.bridgelabz.oopsPrograms;
import java.util.*;

class StockAccountMain {
	public static String finalarr[][] = new String[10][5];
	public static int cnt = 0;
	
	
	public static void createStocks(StockAccountManagement arr[]) {
		arr[0] = new StockAccountManagement("Rolex-Rings ", 100, 2000,"RR");
		arr[1] = new StockAccountManagement("Dell        ", 150, 1000,"DELL");
		arr[2] = new StockAccountManagement("Tata-Steel  ", 10000, 200.80,"TS");
		arr[3] = new StockAccountManagement("Apple       ", 1000, 200000.66,"APPLE");
		arr[4] = new StockAccountManagement("Amazon      ", 500, 150000.99,"AMAZON");
		arr[5] = new StockAccountManagement("Fitbit      ", 900, 5000,"FIT");
		arr[6] = new StockAccountManagement("Morningstar ", 450, 2200.50,"MORN");
		arr[7] = new StockAccountManagement("Zomato      ", 800, 2000.50,"ZOMATO");
		arr[8] = new StockAccountManagement("Samsung     ", 890, 102000.56,"SAMSUNG");
		arr[9] = new StockAccountManagement("T-Mobiles   ", 1500, 3000.81,"T");
	}
	
	public static void save(String temparr[]) {
		for(int j=0;j<5;j++) {
			finalarr[cnt][j] = temparr[j];
			temparr[j] = null;	
			
		}
		cnt+=1;
		System.out.println("Following Stock Data is saved");
	}	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StockAccountManagement arr[] = new StockAccountManagement[10];
		
		createStocks(arr);
		System.out.println("Stock Name" +"       "+ "No of Shares       Share Price    SYMBOL\n");
		for(int i=0;i<arr.length;i++) {
			arr[i].stockReport();	
		}
		
		
		while(true) {
			System.out.println("\n1. Buy a stock\n"
					+ "2. Sell a stock\n"
					+ "3. Print Report\n"
					+ "4. Show Stock Chart");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:	System.out.println("\nHow many Stocks you want to buy: ");
						int count = sc.nextInt();							
						for(int i=0;i<count;i++) {			
							System.out.println("Symbol of the stock");
							String str = sc.next();
							System.out.println("Enter the no of shares");
							int noOfShares = sc.nextInt();
							StockAccount sa = new StockAccount(str.toUpperCase(),noOfShares);
							String temparr[] = sa.buyStocks(arr);
							System.out.println("Stock has successfully bought \nDo you want to save the Data (Y/N)");
							String x = sc.next();
							if(x.toUpperCase().equals("Y"))
								{save(temparr);
								break;
								}
							else
								{Arrays.fill(sa.temparr,null);
								break;
								}
							
						}break;
				
				case 2:	System.out.println("\nHow many Stocks you want to sell: ");
						int count1 = sc.nextInt();							
						for(int i=0;i<count1;i++) {			
							System.out.println("Symbol of the stock");
							String str = sc.next();
							System.out.println("Enter the no of shares to sell");
							int noOfShares = sc.nextInt();
							for(int j=0;j<finalarr.length;j++) {
								if(finalarr[j][0].equals(str.toUpperCase()) && Integer.parseInt(finalarr[j][2])>=noOfShares) {
									StockAccount sa = new StockAccount(str.toUpperCase(),noOfShares);
									String temparr[] = sa.sellStocks(arr);
									System.out.println("Stock has successfully sold \nDo you want to save the Data (Y/N)");
									String x = sc.next();
									if(x.toUpperCase().equals("Y"))
										{save(temparr); 
										break;}
									else
										{Arrays.fill(sa.temparr,null); 
										break;}
								}
								else
									System.out.println("You dont have enough stocks");
							}
						}break;
						
				case 3: StockAccount sa = new StockAccount();
						sa.printReport(finalarr);
						break;
				
				case 4: System.out.println("Stock Name" +"       "+ "No of Shares       Share Price    SYMBOL\n");
						for(int i=0;i<arr.length;i++) {
							arr[i].stockReport();	
						}break;
						
				default: System.out.println("Program Exited"); 
						 return;
						
			}
		}
		
		
	}

}
