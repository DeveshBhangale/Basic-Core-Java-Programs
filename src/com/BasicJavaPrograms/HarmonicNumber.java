package com.BasicJavaPrograms;

import java.util.Scanner;

public class HarmonicNumber {
	
	public static void main(String[] args) {
		int N;
		double res = 1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter a Number Greater than 0");
			while(!sc.hasNextInt()) {
				System.out.println("Entered Input is not a number");
				sc.next();
			}
			N = sc.nextInt();
			
		}while(N<0);
		sc.close();
		
		for(int i=2;i<=N;i++) {
			res += (float)1/i;			
		}
		System.out.println(N+"th harmonic number is "+ res);
		
	}

}
