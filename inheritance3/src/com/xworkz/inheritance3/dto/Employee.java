package com.xworkz.inheritance3.dto;

public class Employee extends Developer {
	String name;
	int id;
	String profession;
	String ambitious;
	String honesty;
	
	public Employee() {
		System.out.println("Employees");
		
	}
	
	public String name(String name) {
		this.name=name;
		return name;
		
	}
	
	public int id(int id) {
		this.id=id;
		return id;
		
	}
	public String profession(String profession) {
		this.profession=profession;
		return profession;
		
	}
	public String ambitious(String ambitious) {
		this.ambitious=ambitious;
		return ambitious;
		
	}
	
	public String honesty(String honesty) {
		this.honesty=honesty;
		return honesty;
		
	}

}
