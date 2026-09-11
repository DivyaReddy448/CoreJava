package com.javaintroduction;

public class Employee {
	static {
    	System.out.println("company name");
    }
	static String companyName = "cdk";
	{
		
		System.out.println("details");
		
	}
	int empid;
	String empname;
	int salary;
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.empid=1;
		e1.empname="divya";
		System.out.println(companyName);
		System.out.println(e1.empid);
		System.out.println(e1.empname);
		System.out.println(e1.salary);

	}

}
