package com.inheritance;
 class Vehicle1 {
	String name;
	int speed;
	Vehicle1(String name,int speed){
		this.name=name;
		this.speed=speed;
	}
	void start() {
		System.out.println(name + " is starting");
	}
	void stop() {
		System.out.println(name + " is stopped");
	}
	void display() {
		System.out.println("vehicle name is:"+ name);
		System.out.println("vehicle speed is:" +speed);
	}

}
class Car extends Vehicle1 {
	Car(String name,int speed){
		super(name,speed);
		
	}
	void sunroof() {
		System.out.println("sunroof is opening");
	}
}

class Bike extends Vehicle1{
	Bike(String name,int speed){
		super(name,speed);
		
	}
	void doWheelie() {
		System.out.println("do wheelie");
	}
}
class Truck extends Vehicle1{
	Truck(String name,int speed){
		super(name,speed);
		
	}
	void loadCargo() {
		System.out.println("truck can load cargo");
	}
}

public class Test1 {
	public static void main(String[] args) {
		Car c=new Car("bmw",100);
		Bike b= new Bike("ktm",80);
		Truck t=new Truck("xyz",70);
		c.display();
		c.start();
		c.sunroof();
		c.stop();
		System.out.println("*************************");
		b.display();
		b.start();
		b.doWheelie();
		b.stop();
		System.out.println("**************************");
		t.display();
		t.start();
		t.loadCargo();
		t.stop();

	}

}
