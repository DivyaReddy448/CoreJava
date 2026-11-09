package com.loops;

import java.util.Scanner;

public class Revision {
	
	static void add(int a,int b) {
		int sum=a+b;
		System.out.println("sum :" + sum);
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a :");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b =sc.nextInt();
		add(a,b);
		
		

	}

}
