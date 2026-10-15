package com.javaintroduction;

public class College {
	int clgId;
	String name;
	String location;
	
	//no-arg constructor
	College(){
		System.out.println("no arg constructor called");
		clgId=100;
		location="hyd";
	}
	//parameterzied constructor
	College(int clgId,String name,String location){
		System.out.println("parameterized constructor");
		this.clgId=clgId;
		this.name=name;
		this.location=location;
		
		
		
	}
	
	

	public static void main(String[] args) {
		System.out.println("main method satarted");
		//default constructor(if no constructor is created)
		//no arg constructor (If developer wants to keep some specifed values as default
		College c1 =new College();
		c1.clgInfo();
		College c2=new College(101,"gnitc","ibp");
		c2.clgInfo();
		
		
		
		System.out.println("main method ended");

	}
	
	void clgInfo() {
		System.out.println("clg Id is:"+clgId);
		System.out.println("name is:"+name);
		System.out.println("location is :"+ location);
		System.out.println("*****************************");
		
	}

}
