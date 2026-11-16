package com.encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e =new Employee();
		e.setId(1);
		e.getId();
		e.setName("divya");
		e.getName();
		e.setSal(50000);
		e.getSal();
		System.out.println("employeee id:"+ e.getId());
		System.out.println("employee name:"+e.getName());
		System.out.println("employee salary:"+e.getSal());
		System.out.println("employee password:"+e.getPassword());
		

	}

}
