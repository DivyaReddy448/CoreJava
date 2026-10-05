package com.javaintroduction;

public class Typecasting {
	int a = 10;
	double b = 10.0;
	char c = 'a';
	double d = a;
	int e = (int) b;
	char f = 70;// int can convert dierctly to char
	int g = f;// char can convert dierctly to int
	short s = (short) 1209857548226L;
	int ch = 65;
	char w=(char)ch;

	public static void main(String[] args) {
		Typecasting t1 = new Typecasting();

		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println(t1.c);
		System.out.println(t1.d);
		System.out.println(t1.e);
		System.out.println(t1.f);
		System.out.println(t1.g);
		System.out.println("long to short:" + t1.s);

	}

}
