package com.javaintroduction;

public class Student {
	static String collegename = "vcube";
	String studentname;
	String studentid;
	int studentmarks;
	static {
		System.out.println(collegename);
		
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.studentname="divya";
		s1.studentid="b797293";
		s1.studentmarks=9;
		
		s2.studentname="akhila";
		s2.studentid="b797278";
		s2.studentmarks=10;
		
		
		
		System.out.println(s1.studentname);
		System.out.println(s1.studentid);
		System.out.println(s1.studentmarks);
		
		
		System.out.println("********************");
		
		
		System.out.println(s2.studentname);
		System.out.println(s2.studentid);
		System.out.println(s2.studentmarks);

	}

}
