package com.loops;

import java.util.Scanner;

public class Fibonacci {
	static Scanner sc =new Scanner(System.in);
	static int n1=0;
	static int n2=1;
	

	public static void main(String[] args) {
		System.out.println("enter a number:");
		int num=sc.nextInt();
		System.out.print(n1 + " " + n2);
		for(int i =1;i<=num -2;i++) {
			int n3;
			n3=n2+n1;
			
			System.out.print(" "+ n3);
			n1=n2;
			n2=n3;
		}
		

	}

}
