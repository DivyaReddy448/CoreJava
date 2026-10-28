package com.javaintroduction;

import java.util.Scanner;

public class SwitchCasesExample {
	static int addition(int a,int b) {
		int add=a+b;
		System.out.println("addition :"+ add);
		return add;
	}
	
	static int subtraction(int a,int b) {
		int sub=a-b;
		System.out.println("subtraction :"+ sub);
		return sub;
		
	}
	static int multiplication(int a,int b) {
		int mul=a*b;
		System.out.println("multiplication :"+ mul);
		return mul;
		
	}
	static int division(int a,int b) {
		int div=a/b;
		System.out.println("division :"+div);
		return div;
	}

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int a = sc.nextInt();
		System.out.println("enter b number:");
		int b = sc.nextInt();
		System.out.println("enter opeartar");
		int oper=sc.nextInt();
		
		switch(oper) {
		case 1->addition(a,b);
		case 2->subtraction(a,b);
		case 3->multiplication(a,b);
		case 4->division(a,b);
		
		
		}
		
		sc.close();

	}

}
