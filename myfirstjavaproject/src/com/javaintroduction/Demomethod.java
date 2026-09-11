package com.javaintroduction;

public class Demomethod {
	static void method1() {
		System.out.println("method1 called");
		Demomethod dd = new Demomethod();
		dd.method3();
	}

	void method2() {

		System.out.println("method2 called");
		method1();
		method3();

	}

	void method3() {
		System.out.println("method3 called");
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Demomethod d = new Demomethod();

		d.method2();
		

		System.out.println("main method ended");

	}

}
