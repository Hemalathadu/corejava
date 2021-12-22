package com.xworkz.inheritance.dto;

public class Bird {
	public String name;
	public String color;
	public float height;
	public float weight;
	public String type;
	
	public Bird(){
		super();
	System.out.println("its a bird");
	}
	
	public String name(String name) {
		this.name=name;
		return name;
	}
	
	public String color(String color) {
		this.color=color;
		return color;
	}
	
	public Bird(float height) {
		this();
		System.out.println("height of bird");
	}
	
	public float weight(float weight) {
		this.weight=weight;
		return weight;
	}
	
	public String type(String type) {
		this.type=type;
		return type;
	}

}
