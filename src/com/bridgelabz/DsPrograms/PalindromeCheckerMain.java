package com.bridgelabz.DsPrograms;

import java.util.Scanner;

public class PalindromeCheckerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PalindromeChecker l1 = new PalindromeChecker<>();
		
		System.out.println("Enter String to check palindrome or not: ");
		String checks = sc.nextLine();
		
		for(int i=0;i<checks.length();i++) {
			l1.addRear(new MyNode(checks.charAt(i)));
		}
		
		l1.print();
		String check = l1.removeFront();
		
		if (checks.equals(check)){
			System.out.println("String is Palindrome");
		}
		else{
			System.out.println("String is not Palindrome");
		}
	}

}
