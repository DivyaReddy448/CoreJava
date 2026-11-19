package com.arrays;

//WAP TO PRINT WHOSE NAMES STARTS WITH  LIKE R && T
public class StringNameFilter {

	public static void main(String[] args) {
		String[] names= {"divya","ramya","sanjana","varsha","sindhu","nashi"};
		for(String n:names) {
			if(n.toLowerCase().startsWith("v") && n.toLowerCase().endsWith("a")) {
				System.out.println(n);
				
			}
		}

	}

}
