package com.javaintroduction;

public class OperationExample {
	static {
		System.out.println("static block");
	}
	int a = 10;
	int b= 20;
	void addition() {
		int sum = a + b;
		System.out.println(sum);
	}
	void subtraction() {
		int sub = a - b;
		System.out.println(sub);
	}
	void Multiplication() {
		int mul = a * b;
		System.out.println(mul);
	}
	void Division() {
		int div = b / a;
		System.out.println(div);
	}
	{
		System.out.println("instance block");
	}

	public static void main(String[] args) {
		OperationExample o = new OperationExample();
		o.addition();
		o.subtraction();
		o.Multiplication();
		o.Division();
		
		

	}

}
