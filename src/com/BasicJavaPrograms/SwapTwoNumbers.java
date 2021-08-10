package com.BasicJavaPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int a,b,c,d,temp;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter two numbers greater than 0");
			while(!sc.hasNextInt()) {
				System.out.println("Entered Input is not a number");
				sc.next();
			}
			a = sc.nextInt();
			b = sc.nextInt();
			break;
		}while(true);
		sc.close();
		c=a;
		d=b;
		temp = c;
		c = d;
		d = temp;
		System.out.println("Swapped two numbers are " + c + " "+ d);
		
		//swapping without using third variable
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Swapped two numbers without using third variable " + a + " "+ b);
		

}
}
