package self_study1;

//*
//**
//***
//****
//*****
// instantiate an object

public class hello_world {
	   public static void main(String[] args) {
		   Vehicle v1= new Vehicle();
		   Vehicle v2= new Vehicle();
		   Employee e1= new Employee("sid", 123, "cs", "m", 20);
		  // Employee e1= new Employee("Puneet", 123, "csi", "m", 27);
		 //  Employee e3[];
		   
	}
}


class Vehicle {
	Vehicle(){
		System.out.println("Hello");
	}
	
	public void finalize() {
		System.out.println("Object destroyed");
	}
	
}

class Employee{
	
	private String name;
	private int employeeNumber;
	private String department;
	private String gender;
	private int age;

	
	Employee(String name, int employeeNumber, String department, String gender, int age){
		this.name= name;
		this.employeeNumber = employeeNumber;
		this.department = department;
		this.gender = gender;
		this.age = age;	
	}
	
	
	public void displayDetails() {
		System.out.println("Name : "+ this.name);
		System.out.println("employeeNumber : "+ this.employeeNumber);
		System.out.println("department : "+ this.department);
		System.out.println("gender : "+ this.gender);
		System.out.println("age : "+ this.age);
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
}