package com.bridgelabz.BasicJavaPrograms;

import java.util.Scanner;

public class PowerOf2 {
	public static boolean checkNumber(int x) {		
		if(x >0 && x <31)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter a Number between 0 and 31");
			while(!sc.hasNextInt()) {
				System.out.println("Entered Input is not a number");
				sc.next();
			}
			N = sc.nextInt();
			
		}while(!checkNumber(N));
		sc.close();
		System.out.println("Powers of 2 \n");
		for(int i=0;i<N;i++) {
			System.out.println(Math.pow(2, i));
		}
	}
	

}
