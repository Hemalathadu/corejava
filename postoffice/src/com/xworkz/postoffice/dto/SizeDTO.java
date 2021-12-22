package com.xworkz.postoffice.dto;

public class SizeDTO {
	private float salary;
	private double price;


	public void setSalary(float salary) {
		this.salary=salary;
	}
	public float getSalary() {
		return salary;
	}

	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	
	
	public String getAll() {
		return salary +"\t"  +price;
	}
}


