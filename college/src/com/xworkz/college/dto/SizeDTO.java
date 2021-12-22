package com.xworkz.college.dto;

public class SizeDTO {
	private float salary;
	private float height;
	
	
	public void setSalary(float salary){
		this.salary=salary;
	}
	
	public float getSalary(){
		return salary;
	}
	
	public void setHeight(float height){
		this.height=height;
	}
	
	public float getHeight(){
		return height;
	}
	
	
	public String getAll() {
		return salary +"\t"  + height;
	}
}


