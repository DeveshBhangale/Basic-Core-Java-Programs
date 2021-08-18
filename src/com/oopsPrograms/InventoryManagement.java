package com.oopsPrograms;

import java.util.Scanner;

public class InventoryManagement{
	
	
	public static void main(String[] args)  throws Exception{
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the number of Inventories you want to compute");
			while(!sc.hasNextInt()) {
				System.out.println("Entered Input is not a number");
				sc.next();
			}
			n = sc.nextInt();
			break;
		}while(true);
		
		InventoryData arr[] = new InventoryData[n];
		String name;
		int weight,price;
		
		for(int i=0; i<n;i++) {
			System.out.println("Enter the Name of Inventory");
			name = sc.next();
			System.out.println("Enter the weight");
			weight = sc.nextInt();
			System.out.println("Enter the price");
			price = sc.nextInt();
			arr[i] = new InventoryData(name,weight,price);
		}
		
		for(int i=0;i<n;i++) {
			arr[i].calculate();
		}
	sc.close();
	}


}
