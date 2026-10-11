package com.javaintroduction;
import java.util.Scanner;


class MethodsPractices {
//	No return type, no parameters
//	Write a program to display "Welcome to Java".
	
	static Scanner sc =new Scanner(System.in);
	void display() {
		System.out.println("welcome to java");
	}
//	Write a program to print your name, age, and city.
	void details() {
		System.out.println("enter u r name:");
		String name = sc.nextLine();
		
		System.out.println("enter u r age");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter u r city");
		String city=sc.nextLine();
		
		System.out.println("name:" + name);
		System.out.println("age:"+age);
		System.out.println("city:"+city);
		
	}
	
	
	
	
	
//	No return type + with parameters
//	 Create a method that accepts two numbers and prints their sum.
	void sum(int a,int b) {
		int sum=a+b;
		System.out.println("sum of two numbers is:" + sum);
	}
//	 Create a method that accepts a number and prints its square.
	void square(double num) {
		
		double sq = Math.pow(num, 2);
		
		System.out.println("square is:"+sq);
		
	}
//Create a method add(int a, int b) that prints the sum of two user-entered numbers.
	void add(int a,int b) {
		int add=a+b;
		System.out.println("addtion is:"+ add);
	}
	
	
//	With Return Type + No Parameters.
//	Write a Java program with a method named getNumber() that returns the number 100
	int getNumber() {
		int number = 100;
		return number;
	}
//	Write a Java program with a method named getSum() that 
//	calculates and returns the sum of two fixed numbers, 25 and 35.
	int getSum() {
		int sum=25+35;
		System.out.println("summ is:" + sum);
		return sum;
		
	}
//	Write a Java program with a method named getSquare().
	double getSquare() {
		System.out.println("enter the number:");
		double a =sc.nextDouble();
		double b =2;
		double s=Math.pow(a, b);
		System.out.println("square is:"+s);
		return s;
	}
//	Write a Java program with a method named getAverage().
	double getAverage() {
		System.out.println("enter first number:");
		double a = sc.nextDouble();
		System.out.println("enter second number:");
		double b =sc.nextDouble();
		
		double avg=(a+b)/2;
		System.out.println("avg is:" + avg);
		return avg;
		}
//	With Return Type + With Parameters
//	Write a Java program with a method named add(int a, int b)
//	that returns the sum of two numbers.
	int add1(int a,int b) {
		int a1=a+b;
		System.out.println("addtion of 2 numbers is:"+a1);
		return a1;
	}
//	Write a Java program using a method getSquare(int n) to
//	calculate the square of 5 and print the returned result in main()
	double getSquare1(int n) {
		double square=Math.pow(n, 2);
		return square;
				
		}
//Write a Java program using a method subtract(int a, int b) to subtract two 
//numbers entered by the user using Scanner and print the returned result in main().
	int subtract(int a,int b) {
		int c=a-b;
		return c;
		}
//Write a Java program using a method getLargest(int a, int b) to 
//return the larger of two numbers entered by the user
//using Scanner. Print the returned result in main().
	int getLargest(int a2,int b2) {
		if(a2>b2) {
			return a2;
		}else {
			return b2;
		}
	}


	public static void main(String[] args) {
		MethodsPractices m1=new MethodsPractices();
		m1.display();
		m1.details();
		m1.sum(10, 20);
		m1.square(10);
		
		System.out.println("enter first number:");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		m1.add(a, b);
		
		System.out.println(m1.getNumber());
		m1.getSum();
		m1.getSquare();
		
		m1.getAverage();
		m1.add1(10, 20);
		System.out.println(m1.getSquare1(4));
		System.out.println("enter first number:");
		int a3 =sc.nextInt();
		System.out.println("enter second number:");
		int b3 = sc.nextInt();
		System.out.println("sub is:"+m1.subtract(a3, b3));
		
		System.out.println("enter 1st number:");
		int a2=sc.nextInt();
		System.out.println("enter 2nd number:");
		int b2=sc.nextInt();
		System.out.println("largest number is:"+ m1.getLargest(a2, b2));

	}

}
