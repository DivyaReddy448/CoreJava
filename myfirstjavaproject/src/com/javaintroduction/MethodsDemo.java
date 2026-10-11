package com.javaintroduction;

public class MethodsDemo {
	static int add(int a, int b) {
		int sum = a + b;
		System.out.println("sum of 2 numbers is:" + sum);
		return sum;

	}

	static int sub(int a,int b) {
		int difference=a-b;
		System.out.println("sub is:" + difference);
		return difference;
		

	}

	int multiplication(int a ,int b) {
		int mul=a*b;
		System.out.println("multiplication is:"+ mul);
		return mul;

	}

	int division(int a,int b) {
		int div=a/b;
		System.out.println("division is:"+div);
		return div;

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int res=add(10,20);
		sub(res,10);
		MethodsDemo m1 = new MethodsDemo();
		m1.multiplication(res,10);
		int m =sub(20,5);
		m1.division(m,2);
		
		
		System.out.println("main method ended");

	}

}
