package com.xworkz.inheritance2.dto;

public class Flowers extends Lotus{
	public String name;
	public String color;
	public String fragrance;
	public String sepals;
	public String stamen;
	
	public Flowers() {
	
		System.out.println("Flowers is beautiful");
	}
	
	public String name(String name) {
		this.name=name;
		return name;
	}
	
	public String color(String color) {
		this.color=color;
		return color;
	}
	
	public String fragrance(String fragrance) {
		this.fragrance=fragrance;
		return fragrance;
	}

	public String sepals(String sepals) {
		this.sepals=sepals;
		return sepals;
	}
	
	public String stamen(String stamen) {
		this.stamen=stamen;
		return stamen;
	}
}
