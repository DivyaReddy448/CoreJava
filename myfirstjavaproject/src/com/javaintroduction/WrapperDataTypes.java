package com.javaintroduction;

public class WrapperDataTypes {
	Integer StudenId;
	String StudentName;
	Integer Age;
	Double Marks;
	Character Grade;
	Boolean Passed;

	public static void main(String[] args) {
		WrapperDataTypes d = new WrapperDataTypes();
		d.StudenId=101;
		d.StudentName="Divya";
		d.Age=22;
		d.Marks=85.08;
		d.Grade='A';
		d.Passed=true;
		
		
		System.out.println("StudenId is:"+ d.StudenId);
		System.out.println("StudentName is:"+ d.StudentName);
		System.out.println("Age is:"+ d.Age);
		System.out.println("Marks is:"+ d.Marks);
		System.out.println("Grade is:"+ d.Grade);
		System.out.println("Passed is:"+ d.Passed);
		if(d.Passed==true){
			System.out.println("student passed the exam");
			
		}

	}

}
