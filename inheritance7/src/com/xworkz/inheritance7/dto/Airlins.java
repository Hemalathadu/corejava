package com.xworkz.inheritance7.dto;

public class Airlins extends Indigo {
	
	public int noofpassengers;
	public int officers;
	public int noofseats;
	public int inflightmeals;
	public int price;
	
	
	
public Airlins() {
	System.out.println("Its a Airlines");
}

public int noofpassengers(int noofpassengers) {
	this.noofpassengers=noofpassengers;
	return noofpassengers;
	
}

public int officers(int officers) {
	this.officers=officers;
	return officers;
	
}

public int noofseats(int noofseats) {
	this.noofseats=noofseats;
	return noofseats;
	
}

public int inflightmeals(int inflightmeals) {
	this.inflightmeals=inflightmeals;
	return inflightmeals;
	
}

public int price(int price) {
	this.price=price;
	return price;
	
}
}
