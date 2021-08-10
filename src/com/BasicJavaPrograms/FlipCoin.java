package com.BasicJavaPrograms;
import java.util.*;


public class FlipCoin {
	public static void main(String[] args) {
		int noOfFlips,heads=0,tails=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter a Positive Number");
			while(!sc.hasNextInt()) {
				System.out.println("Entered Input is not a number");
				sc.next();
			}
			noOfFlips = sc.nextInt();
		}while(noOfFlips<=0);
		sc.close();
		
		final double threshold = 0.5;
		
		for (int i=0;i<noOfFlips;i++) {
			if(Math.random() < threshold) {
				heads++;
			}
			else {
				tails++;
			}
		}
		
		System.out.println("Total number of Heads Percentage is "+ (heads*10/noOfFlips*10));
		
		System.out.println("Total number of Tails Percentage is "+ (tails*10/noOfFlips*10));
	}
}
