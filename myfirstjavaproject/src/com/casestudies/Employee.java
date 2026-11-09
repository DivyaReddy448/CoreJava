package com.casestudies;

public class Employee {
	int id;
	String name;
	float salary;
	
	Employee(int id,String name,float salary){
		this.id = id;
        this.name = name;
        this.salary = salary;
	}
	double calculateBonus() {
        return salary * 10 / 100;
    }


	void displayDetails() {
        double bonus = calculateBonus();
        double finalSalary = salary + bonus;

        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Final Salary: " + finalSalary);
    }

    public static void main(String[] args) {

        Employee emp = new Employee(101, "Divya", 30000);

        emp.displayDetails();
    }
}
