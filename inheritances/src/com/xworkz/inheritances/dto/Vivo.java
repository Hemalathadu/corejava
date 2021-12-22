package com.xworkz.inheritances.dto;

public class Vivo {
	public String name;
	public String color;
	public String camera;
	public int displaysize;
	public int price;
	
	public Vivo() {
		System.out.println("Vivo are fine");
	}
	public String name(String name) {
		this.name=name;
		return name;
	}
	
	public String color(String color) {
		this.color=color;
		return color;
	}
	
	public String camera(String camera) {
		this.camera=camera;
		return camera;
	}
	
	public int displaysize(int displaysize) {
		this.displaysize=displaysize;
		return displaysize;
	}
	
	public int price(int price) {
		this.price=price;
		return price;
	}
	
	
	
	
	


}
