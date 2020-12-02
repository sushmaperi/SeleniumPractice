package com.seleniumpractice;

import java.util.Scanner;

public class FromConsole {

	public static void main(String[] args) {
		// Importing Scanner class by creating an object
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of A");
		int a = s.nextInt();
		
		System.out.println("Enter value of B");
		int b = s.nextInt();
		
		
		System.out.println("Product of A and B is " + a*b);
		

	}

}
