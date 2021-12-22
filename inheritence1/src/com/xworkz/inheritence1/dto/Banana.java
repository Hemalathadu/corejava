package com.xworkz.inheritence1.dto;

public class Banana {
	public String type;
	public String color;
	public int size;
	public String taste;
	public int calories;
	
	public Banana(){
		System.out.println("Iis healthy food");
	}
	
	public String type(String type) {
		this.type=type;
		return type;
	}
	
	public String color(String color) {
		this.color=color;
		return color;
	}
	
	public int size(int size) {
		this.size=size;
		return size;
	}
	
	String taste(String taste) {
		this.taste=taste;
		return taste;
	}
	
	int calories(int calories) {
		this.calories=calories;
		return calories;
	}

}
