package com.javaintroduction;

import java.util.Scanner;

//with return type no parameter
public class Methods3 {
	
	static int getNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int number=sc.nextInt();
		return number;
	}

	public static void main(String[] args) {
		int res=getNumber();
		System.out.println("number is:"+res);

	}

}
