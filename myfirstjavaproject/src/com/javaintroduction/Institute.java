package com.javaintroduction;

public class Institute {
	static String TrainerName1 = "aaa";
	static String TrainerName2 = "bbb";
	String EmployeeName;
	int EmployeetId;
	String EmployeeDesignation;

	void main(String[] args) {
		Institute i1 = new Institute();
		Institute i2 = new Institute();
		EmployeeName = "a";
		i1.EmployeetId = 1;
		i1.EmployeeDesignation = "testing";
		i2.EmployeeName = "b";
		i2.EmployeetId = 2;
		i2.EmployeeDesignation = "sw";
		System.out.println(TrainerName1);
		System.out.println(TrainerName2);
		System.out.println(i1.EmployeetId);
		System.out.println(EmployeeName);
		System.out.println(i1.EmployeeDesignation);
		System.out.println(i2.EmployeeName);
		System.out.println(i1.EmployeetId);
		System.out.println(i1.EmployeeDesignation);

	}

}
