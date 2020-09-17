package org.test.java1;

public class Employee extends Company{
	
	//Creating a Constructor
	//Default constructor/Non Parameterized constructor
	
	public Employee() {
		//1st Line of constructor
		
		super(100);
		System.out.println("Default constructor");
		
	}
	
	//Parameterized constructor
	
	public Employee(String name) {
		
		System.out.println("Int para constructor");
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		Employee e1=new Employee("Hello");
		
	}
}
