package com.LogicalPrograms;
import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		int thousand=0,fiveHundred=0,hundred=0,fifty=0,ten=0,five=0,two=0,one=0;
		int number;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter a Number");
			while(!sc.hasNextInt()) {
				System.out.println("Entered Input is not a number");
				sc.next();
			}
			number = sc.nextInt();
			break;
		}while(true);
		sc.close();
		
		
		while(true) {		
		
			if(number>=1000) {
				number-=1000;
				thousand+=1;
			}
			else if(number>=500){
				number-=500;
				fiveHundred+=1;
			}
			else if(number>=100){
				number-=100;
				hundred+=1;
			}
			else if(number>=50){
				number-=50;
				fifty+=1;
			}
			else if(number>=10){
				number-=10;
				ten+=1;
			}
			else if(number>=5){
				number-=5;
				five+=1;
			}
			else if(number>=2){
				number-=2;
				two+=1;
			}
			else if(number>=1){
				number-=1;
				one+=1;
			}
			else
				break;
	}
		System.out.println("Required Number of Currencies are: \n"
				+ "1000 - "+ thousand
				+ "\n500 - "+ fiveHundred
				+ "\n100 - "+ hundred
				+ "\n50 - "+fifty
				+ "\n10 - "+ten
				+ "\n5 - "+ five
				+ "\n2 - "+ two
				+ "\n1 - "+ one);
	}

}
