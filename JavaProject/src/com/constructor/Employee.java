package com.constructor;

public class Employee {

	public void empName() {
		System.out.println("Arun");
	}
	
	public Employee() { //constructor
		System.out.println("This is a non parameterized constructor");
	}
	
	public Employee(int a,int b,String s) {
		System.out.println("Parameterized constructor "+a+b+s);
	}
	
	
	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1= new Employee(545, 23, "hello world");
		e.empName();
		
	}
	
}
