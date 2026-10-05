package com.javaintroduction;

public class Student1 {
	int rollno;
	String name;
	int marks;
	static  String clgname ="GNITC";
	static int clgid =101;
	static {
		System.out.println(" welcome to GNITC");
	}
	
	{
		System.out.println("student object created");
	}
	 void studentdetails(){
		 System.out.println("rollno is:"+ rollno);
		 System.out.println("name is:"+ name);
		 System.out.println("marks is:"+ marks);
		 
		
	}
	 static  void clgdetails(){
		 System.out.println("clgname is:"+ clgname);
		 System.out.println("clgid is:"+ clgid);
		 
		 
		 
	 }
	

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		s1.rollno=1;
		s1.name="divya";
		s1.marks=9;
		s2.rollno=2;
		s2.name="nashitha";
		s2.marks=10;
		s1.studentdetails();
		s2.studentdetails();
		clgdetails();

	}

}
