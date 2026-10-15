package com.javaintroduction;

public class StudentConstructor {
	static int count=0;
	
	
	
	StudentConstructor(){
		System.out.println("constructor called ");
		count++;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		StudentConstructor s1 = new StudentConstructor();
		StudentConstructor s2 = new StudentConstructor();
		System.out.println("no of objects count:"+count);
		System.out.println("main method ended");
		

	}

}
