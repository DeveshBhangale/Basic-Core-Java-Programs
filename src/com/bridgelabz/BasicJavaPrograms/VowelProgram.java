package com.bridgelabz.BasicJavaPrograms;

import java.util.Scanner;

public class VowelProgram {
	public static void main(String[] args) {
			
			String s;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a character");
			s = sc.nextLine();
			sc.close();
			
			char ch = s.charAt(0);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
	            System.out.println(ch + " is vowel");
	        else
	            System.out.println(ch + " is consonant");
	
	    }
}
