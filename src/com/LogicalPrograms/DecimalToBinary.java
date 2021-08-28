package com.LogicalPrograms;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter a positive Number");
			while(!sc.hasNextInt()) {
				System.out.println("Entered Input is not a number");
				sc.next();
			}
			n = sc.nextInt();
		}while(n<=0);
		sc.close();
		
		String s = Integer.toBinaryString(n);
		String s1 = "";
		for (int i = 0; i<(8-s.length());i++) {
			s1+="0";
		}
		System.out.println("Required Binary output is " +s1+s);
	}
	
}
