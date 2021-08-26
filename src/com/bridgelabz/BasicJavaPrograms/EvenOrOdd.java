package com.bridgelabz.BasicJavaPrograms;

import java.util.*;

public class EvenOrOdd {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter a Number");
			while(!sc.hasNextInt()) {
				System.out.println("Entered Input is not a number");
				sc.next();
			}
			N = sc.nextInt();
			break;
		}while(true);
		sc.close();
		
		if(N % 2 ==0)
			System.out.println("Even Number");
		else
			System.out.println("odd Number");

}

}
