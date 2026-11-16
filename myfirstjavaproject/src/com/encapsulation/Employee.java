package com.encapsulation;
//Create an encapsulated class Employee with private fields: id, name, salary, password.
//Requirements:
//I. Make all fields private (Data Hiding).
//II. Create public setters and getters.
//III. Access and modify the data

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String password="wertyuioiuyt";
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSal(double salary) {
		this.salary=salary;
		
	}
	public double getSal() {
		return salary;
	}
//	public void setPassword(String password) {
//		this.password=password;
//	}
	public String getPassword() {
		return password;
		
	}

}
