package com.javaintroduction;

public class ExampleMethod {
	String StudentName;
	int rollNumber;
	String course ;
	int JavaMarks;
	int SqlMarks;
	int PythonMarks;
	int sum;

	void displayStudentDetails() {
		System.out.println("StudentName :" + StudentName);
		System.out.println("rollNumber :" + rollNumber);
		System.out.println("course:" + course);

	}
 
	void calculateTotal() {
		sum = JavaMarks + SqlMarks + PythonMarks;
		System.out.println("Javamarks:" + JavaMarks);
		System.out.println("sqlmarks:" + SqlMarks);
		System.out.println("Pythonmarks:" + PythonMarks);

		System.out.println("totalmarks :" + sum);
	}

	void calculateAverage() {
		double avg = sum/3;
		System.out.println("average marks:" + avg);

	}

	public static void main(String[] args) {
		ExampleMethod e = new ExampleMethod();
		e.StudentName="divya";
		e.SqlMarks=7;
		e.course="jfs";
		e.JavaMarks=8;
		e.PythonMarks=6;
		e.rollNumber=7293;
		e.displayStudentDetails();
		e.calculateTotal();
		e.calculateAverage();

	}

}
