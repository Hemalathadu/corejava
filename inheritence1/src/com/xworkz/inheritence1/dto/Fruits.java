package com.xworkz.inheritence1.dto;

public class Fruits extends Banana {
	public String name;
	public String vitamin;
	public String taste;
	public String color;
	public int price;
	
	public Fruits(){
		System.out.println("Fruits are very ricch in vitamins");
	}
	
	public String name(String name) {
		this.name=name;
		return name;
	}
	
	public String vitamin(String vitamin) {
		this.vitamin=vitamin;
		return vitamin;
	}
	
	public String taste(String taste) {
		this.taste=taste;
		return taste;
	}
	
	public String color(String color) {
		this.color=color;
		return color;
	}
	
	public int price(int price) {
		this.price=price;
	    return price;
	}

}
