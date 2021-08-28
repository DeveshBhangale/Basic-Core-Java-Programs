package com.LogicalPrograms;

import java.util.Scanner;

public class StopwatchProgram {
	public static void main(String[] args) {
		String s,s1;
		long start,stop;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Type start or s to start the stopwatch");			
			s = sc.next();
			start = System.currentTimeMillis();
			System.out.println("Type start or s to stop the stopwatch");
			s1 = sc.next();
			stop = (System.currentTimeMillis() - start)/1000;
			
			break;
		}while(true);
		sc.close();
		System.out.printf("Total time taken is " + stop + " seconds");
	}
}
