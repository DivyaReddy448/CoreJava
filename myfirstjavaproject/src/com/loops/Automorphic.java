package com.loops;

import java.util.Scanner;

public class Automorphic {
	
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int square = num * num;
		int count=0;
		int originalNumber=num;
		int lastDigits=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		lastDigits = square % (int)Math.pow(10, count);
		if(originalNumber==lastDigits) {
			System.out.println("number is automorphic");
		}else {
			System.out.println("number is not automorphic");
		}
		
		

	}

}
