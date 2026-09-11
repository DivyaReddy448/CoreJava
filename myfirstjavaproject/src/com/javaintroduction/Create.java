package com.javaintroduction;

public class Create {
	static int count = 0;
	{
		count++;
	}

	public static void main(String[] args) {
		Create c1 = new Create();
		Create c2 = new Create();
		Create c3 = new Create();
		Create c4 = new Create();
		System.out.println(count);


	}

}
