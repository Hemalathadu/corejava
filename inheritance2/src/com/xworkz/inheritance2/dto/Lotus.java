package com.xworkz.inheritance2.dto;

public class Lotus {
	public int noofpetals;
	public String color;
	public String family;
	public String kingdom;
	public String clade;
	
	public Lotus() {
		super();
		System.out.println("Its a beautiful");
	}
	
	public Lotus(int noofpetals){
		this();
System.out.println("lotus is beautiful");
	
	}
	
	public String color(String color) {
		this.color=color;
		return color;
	}
	
	public String family(String family) {
		this.family=family;
		return family;
	}
	
	public String kingdom(String kingdom) {
		this.kingdom=kingdom;
		return kingdom;
	}
	
	public String clade(String clade) {
		this.clade=clade;
		return clade;
	}
	
	

}
