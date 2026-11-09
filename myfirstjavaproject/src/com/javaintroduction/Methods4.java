package com.javaintroduction;

import java.util.Scanner;

public class Methods4 {
	static int add(int a,int b) {
		int add=a+b;
		return add;
		
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a:");
		int x = sc.nextInt();
		System.out.println("enter b");
		int y =sc.nextInt();
		int res=add(x,y);
		System.out.println("sum is:"+res);
		

		
	}

}
