package com.oopsPrograms;


class InventoryData {
	public final String name;
	public final double weight;
	public final double price;

	
	
	public InventoryData(String name,double weight,double price) {
		this.name = name;
		this.weight = weight;
		this.price = price;
	}	
	
	public void calculate() {
		System.out.printf("Total price of "+name+" "+weight+" kg is "+"%.2f Rs \n",(weight*price));
	}
	
	


}
