package com.javaintroduction;

import java.util.Scanner;

public class CheckNumberPoN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		String res=(num>=0)?"postive":"negative";
		System.out.println(res);
		sc.close();
		
		

	}

}
