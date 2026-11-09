package com.loops;

import java.util.Scanner;

//Write a java program to Print all prime numbers from 1 to 100.

public class PrimeNumber {
	static boolean isPrime(int n) {
		boolean status =true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}

		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number:");
		int num = sc.nextInt();
	    

		for (int i = 2; i <= num; i++) {
			if (isPrime(i)){
				System.out.println(i + " ");
			}
		}

	}

}





