package day02;

import java.util.Scanner;

public class Advance_1_RightTrianglePattern {

	/*
	 * Create Right Triangle pattern
	 * 
	 * Example: Enter a number 
		Input=		5
			 * 
			 * * 
			 * * * 
			 * * * * 
			 * * * * *
	 */
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number");
		int n= scan.nextInt();
		
		rightTriangle(n);
		
		
	}

	private static void rightTriangle(int n) {
		for (int i=0; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}
}
