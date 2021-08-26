package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void fib(int a) {
		int n1=0,n2 = 1,count =0,nth;
		System.out.println("Fibonacci Sequence: ");
		if(a<=1) {
			System.out.println(1);
		}
		else {
			while(count < a) {
				System.out.println(n1);
				nth = n1 +n2;
				n1 = n2;
				n2 = nth;
				count+=1;
			}
		}
	}
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter a Number");
			while(!sc.hasNextInt()) {
				System.out.println("Entered Input is not a number");
				sc.next();
			}
			a = sc.nextInt();
			break;
		}while(true);
		sc.close();
		
		fib(a);
	}

}
