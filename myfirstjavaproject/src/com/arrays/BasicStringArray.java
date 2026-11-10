package com.arrays;

public class BasicStringArray {

	public static void main(String[] args) {

//		declaration
//		String[] names;
//		initialization
//		names = new String[5];
//		creation
//		names[0]="divya";
//		names[1]="sindhu";
//		names[2]="nashitha";
		
		
		
//		declaration and initialization
		String[] names=new String[5];
//		creation
		names[0]="divya";
		names[1]="sindhu";
		names[2]="nashitha";
		
		
//		declaration and initialization and creation
//		String names[]= {"divya","nashitha","sindhu"};
//		representation
		for(String n:names) {
			System.out.println(n);
		}

	}

}
