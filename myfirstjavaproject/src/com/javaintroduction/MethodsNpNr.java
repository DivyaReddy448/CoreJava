package com.javaintroduction;

import java.util.Scanner;

//NO RETURN TYPE NO PARAMETER
public class MethodsNpNr {
	Scanner sc = new Scanner(System.in);

//	print the difference between two numbers.
	void difference() {
		System.out.println("enter 1st number:");
		int FirstNumber = sc.nextInt();
		System.out.println("enter 2nd number:");
		int SecondNumber = sc.nextInt();
		int difference = FirstNumber - SecondNumber;
		System.out.println("difference is:" + difference);

	}

//	 Print the product of two numbers
	void product() {
		System.out.println("enter 1st number:");
		int FirstNumber = sc.nextInt();
		System.out.println("enter 2nd number:");
		int SecondNumber = sc.nextInt();
		int product = FirstNumber * SecondNumber;
		System.out.println("product  is:" + product);
	}
//	Print the division of two numbers.
	void division() {
		System.out.println("enter 1st number:");
		double FirstNumber=sc.nextDouble();
		System.out.println("enter 2nd number:");
		double SecondNumber=sc.nextDouble();
		double division=FirstNumber/SecondNumber;
		System.out.println("division is:"+division);
	}
//	Print the remainder of two numbers.
	void remainder() {
		System.out.println("enter 1st number:");
		double FirstNumber=sc.nextDouble();
		System.out.println("enter 2nd  number:");
		double SecondNumber=sc.nextDouble();
		double remainder=FirstNumber % SecondNumber;
		System.out.println("remainder is:"+remainder);
	}
//	Print the square of a number.
	void square() {
		System.out.println("enter a number:");
		int Number=sc.nextInt();
		int square=Number * Number;
		System.out.println("square is:"+square);
	}
//	Print the cube of a number.
	void cube(){
		System.out.println("enter a number");
		int Number=sc.nextInt();
		int cube=Number*Number*Number;
		System.out.println("cube is:"+cube);
		
	}
//	Print the average of two numbers.
	void average() {
		System.out.println("enter fisrtnumber:");
		int FirstNumber=sc.nextInt();
		System.out.println("enter second number:");
		int SecondNumber=sc.nextInt();
		
		int avg=(FirstNumber+SecondNumber)/2;
		System.out.println("average is:"+avg);
	}
//	Print the double of a number
	void doubleNumber() {
		System.out.println("enter a number");
		double num=sc.nextDouble();
		double doubleNumber=num * 2;
		System.out.println("double of the number is:"+doubleNumber);
	}
	
//	Print the perimeter of a square.
	void perimeterSquare() {
		System.out.println("enter side :");
		int side=sc.nextInt();
		int perimeter=side * 4;
		System.out.println("perimeter of square is:"+perimeter);
	}
//	Print the perimeter of a rectangle
	void perimeteRectangle() {
		System.out.println("enter length:");
		int length=sc.nextInt();
		System.out.println("enter breadth");
		int breadth=sc.nextInt();
		int perimeter=2*(length+breadth);
		System.out.println("perimeter of rectangle is:"+perimeter);
	}
//	Print the circumference of a circle.
	void circle() {
		System.out.println("enter radius:");
		double radius=sc.nextInt();
		double cir=2 * Math.PI * radius;
		System.out.println("circumference of a circle:"+cir);
		
	}
//	Print the distance travelled using speed and time
	void distance() {
		System.out.println("enter speed:");
		double speed=sc.nextDouble();
		System.out.println("enter time");
		double time=sc.nextDouble();
		double distance=speed*time;
		System.out.println("distance is:"+distance);
	}
//	Print the price after a discount.
	void discount() {
		System.out.println("enter original price:");
		double original_price=sc.nextDouble();
		System.out.println("enter discount:");
		double discount=sc.nextDouble();
		double discountAmount=(original_price * discount)/100;
		double finalPrice=original_price-discountAmount;
		System.out.println("final price after discount is:"+ finalPrice);
	}
	void main(String[] args) {
		difference();
		product();
		division();
		remainder();
		square();
		cube();
		average();
		doubleNumber();
		perimeterSquare();
		perimeteRectangle();
		circle();
		distance();
		discount();

	}

}
