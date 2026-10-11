package com.javaintroduction;

public class WrapperObjectDataTypes {
	Integer StudentID = 1;
	double f=90.0;
	Integer Marks=99;
	Boolean Status=true;
	int stid = StudentID;
//	Float f1 = (Float)Marks;
	boolean updatestatus = Status;

	public static void main(String[] args) {
		WrapperObjectDataTypes s1 = new WrapperObjectDataTypes();
		System.out.println("StudentID:"+ s1.StudentID);
		System.out.println("Marks"+s1.Marks);
		System.out.println("status:"+s1.Status);
		System.out.println("stid:"+s1.stid);
		System.out.println("updatestatus:"+s1.updatestatus);

		//auto boxing
		int a = 10000;
		System.out.println(a);
		Integer b = a;
		System.out.println(b);
		//auto unboxing
		Integer i1 = 100000000;
		System.out.println(i1);
		int i2= i1;
		System.out.println(i2);
		

		
		
		

	}

}
