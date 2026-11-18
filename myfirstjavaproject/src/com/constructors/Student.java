package com.constructors;

public class Student {
//	Two instance variables: int id and String name.
//	A parameterized constructor that initializes both variables.
//	A copy constructor that accepts a Student object.
//	A main() method that creates an original object and a copied object.
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	Student(Student s){
		this.id=s.id;
		this.name=s.name;
	}

	public static void main(String[] args) {
		Student s = new Student(1,"divya");
		Student s1=new Student(s);
		System.out.println(s.name);
		System.out.println(s1.name);
		System.out.println("*********");
		s1.name="nashitha";
		System.out.println(s.name);
		System.out.println(s1.name);
		
		
		

	}

}
