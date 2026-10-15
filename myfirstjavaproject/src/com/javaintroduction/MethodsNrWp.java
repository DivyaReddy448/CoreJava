package com.javaintroduction;
//NO RETURN TYPE WITH PARAMETERS
import java.util.Scanner;
public class MethodsNrWp {
	Scanner sc=new Scanner(System.in);
//	Accept two numbers and print their sum.
	void sum(int a,int b) {
		int sum=a+b;
		System.out.println("sum of the numbers:"+sum);
	}
//	Accept two numbers and print their remainder.
	void remainder(double a,double b) {
		double remainder=a%b;
		System.out.println("remainder is:"+remainder);
	}
//	Accept a number and print its square
	void square(int a) {
		double square=Math.pow(a, 2);
		System.out.println("square is"+ square);
	}
//	Accept a number and print its cube
	void cube(int a) {
		double cube= a * a * a;
		System.out.println("cube is:"+cube);
	}
//	Accept two numbers and print their average.
	void average(int a,int b) {
		double average=(a+b)/2;
		System.out.println("average is:"+average);
	}
//	Accept a number and print its double.
	void doubleOfNumber(int a) {
		int doubleNumber=a*2;
		System.out.println("double of number is:"+doubleNumber);
	}
//	Accept a side and print the area of a square.
	void squareSide(int a) {
		long side=a * a;
		System.out.println("enter a side :" + side);
	}
//	Accept length and breadth and print the area of a rectangle.
	void rectangle(int a,int b) {
		double area=a * b;
		System.out.println("area of rectangle is:"+area);
	}
//	Accept base and height and print the area of a triangle.
	void triangle(int a,int b) {
		double area=0.5*a*b;
		System.out.println("area of triangle is:"+ area);
	}
//	Accept a radius and print the area of a circle.
	void circle(int a) {
		double area=Math.PI * a * a;
		System.out.println("area of circle is:"+area);
	}
//	Accept length and breadth and print the perimeter of a rectangle
	void rec(int l,int b) {
		double perimeter=2*(l+b);
		System.out.println("perimeter of rectangle is:"+perimeter);
	}
//	Accept annual salary and print monthly salary
	void salary(int a ){
		double monthly_salary=a/12;
		System.out.println("monthly salary is:"+monthly_salary );
	}
	void main(String[] args) {
		//sum
		System.out.println("enter a first number:");
		int firstNumber=sc.nextInt();
		System.out.println("enter second number:");
		int secondNumber=sc.nextInt();
		sum(firstNumber,secondNumber);
		//remainder
		remainder(firstNumber,secondNumber);
		//square
		square(firstNumber);
		//cube
		cube(firstNumber);
		//average
		average(firstNumber,secondNumber);
//		doubleNumber
		doubleOfNumber(firstNumber);
//		squareSide
		squareSide(firstNumber);
//		rectangle
		rectangle(firstNumber,secondNumber);
//		triangle
		triangle(firstNumber,secondNumber);
//		circle
		circle(firstNumber);
//		perimeter of rectangle
		rec(firstNumber,secondNumber);
//		annual salary
		salary(400000);
		
		
		

	}

}
