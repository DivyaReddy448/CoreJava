package com.javaintroduction;

import java.util.Scanner;

public class Areas {
	Scanner sc = new Scanner(System.in);

	static double areaOfTraiangle(double a, double b) {
		double areaofTri = 0.5 * a * b;
		return areaofTri;

	}
	double areaofCircle(double a) {
		double circle=Math.PI * a * a;
		return circle;
	}
	
	double areaOfSquare(double s) {
		double square = s*s;
		return square;
	}
	double areaOfRectangle(double l,double b) {
		double rec=l*b;
		return rec;
	}

	void main(String[] args) {
		System.out.println("enter base:");
		double base1 = sc.nextDouble();
		System.out.println("enter height:");
		double height1 = sc.nextDouble();
		System.out.println("area of triangle is:"+areaOfTraiangle(base1, height1));
		
		System.out.println("enter radius:");
		double radius=sc.nextDouble();
		System.out.println("area of circle is:" + areaofCircle(radius));
		
		System.out.println("enter side:");
		double s=sc.nextDouble();
		System.out.println("area of square:" + areaOfSquare(s));
		
		System.out.println("enter lenght:");
		double len=sc.nextDouble();
		System.out.println("enter breadth:");
		double bre =sc.nextDouble();
		System.out.println("area of rectangle is:" + areaOfRectangle(len,bre));
		

	}

}
