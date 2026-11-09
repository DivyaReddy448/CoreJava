package com.loops;

import java.util.Scanner;

//.Write a Java program to print numbers from 1 to 20 using a for loop.
public class Numbers {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number from where you want to print");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}

	}

}
