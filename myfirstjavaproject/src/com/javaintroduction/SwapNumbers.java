package com.javaintroduction;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number:");
		int a = sc.nextInt();
		System.out.println("Enter a second number:");
		int b = sc.nextInt();
		System.out.println("before swaping A:" + a);
		System.out.println("before swaping B:" + b);
//		using third variable
//		int temp;
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.println("after swaping A:" + a);
//		System.out.println("after swaping B:" + b);

		
		//using operators
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("after swaping A:" + a);
//		System.out.println("after swaping B:" + b);
		
		
		//without operators
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("after swaping A:" + a);
		System.out.println("after swaping B:" + b);
	
		
		sc.close();
		
		

	}

}
