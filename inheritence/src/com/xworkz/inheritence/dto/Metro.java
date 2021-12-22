package com.xworkz.inheritence.dto;

public class Metro {
	public String name;
	public int voltage;
	public String color;
	public String type;
	public String station;
	
	public Metro(){
		System.out.println("its is a metro");
	}
	
	public String name(String name) {
		this.name=name;
		return name;
	}
	
	public int voltage(int voltage) {
		this.voltage=voltage;
		return voltage;
	}
	public String color(String color) {
		this.color=color;
		return color;
	}
	public String type(String type) {
		this.type=type;
		return type;
	}
	public String station(String station) {
		this.station=station;
		return station;
	}
	
	
	

}
