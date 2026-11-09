package com.loops;

import java.util.Scanner;

//Write a Java program to print all even numbers from 1 to 50 using a for loop.
public class Even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number upto where u want to print");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i % 2==0) {
				System.out.println(i);
			}
		}

	}

}
