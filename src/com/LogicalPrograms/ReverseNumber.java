package com.LogicalPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int number, reverse = 0;  
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
		
		
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		}  

	}


