package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class SwappingofbinaryNumbers {
	public static int toDecimal(int n){
		int ans=0,i=0;
		while(n>0) {
			ans += (n%10)*Math.pow(2, i);
			n = n/10;
			i++;

		}
		return ans;
	
	}

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
		s = s+s1;
		System.out.println("Required Decimal Number is "+ toDecimal(Integer.parseInt(s)));
	}
}
