package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class PerfectNumber {
		static long sum=0; 
		public static long Perfect(long n,int i){			 
			if(i<=n/2) {
				if(n%i == 0) {
					sum = sum + i;
				}
				i++;
				Perfect(n,i);
			}
			return sum;
		}
		public static void main(String[] args) {
			long n,s;
			int i = 1;
			Scanner sc = new Scanner(System.in);
			do {
				System.out.println("Please enter a Number");
				while(!sc.hasNextLong()) {
					System.out.println("Entered Input is not a number");
					sc.next();
				}
				n = sc.nextLong();
				break;
			}while(true);
			sc.close();
			s = Perfect(n,i);
			if(s == n)
				System.out.println(n +" is a Perfect Number");
			else
				System.out.println(n +" is not a Perfect Number");
		}
}

