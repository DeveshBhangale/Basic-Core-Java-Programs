package com.bridgelabz.BasicJavaPrograms;

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter a Number Greater than 0");
			while(!sc.hasNextInt()) {
				System.out.println("Entered Input is not a number");
				sc.next();
			}
			n = sc.nextInt();
			
		}while(n<0);
		sc.close();

		while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
		
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
		if (n > 2)
            System.out.print(n);
	}

}
