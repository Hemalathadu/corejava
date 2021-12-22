package com.xworkz.inheritance5.dto;

public class Wood extends Table {
	String type;
	String strength;
	float gravity;
	int moisture;
	String grain;
	
	public Wood() {
		System.out.println("Wood is Fibre");
		
	}
	
	public String type(String type) {
		this.type=type;
		return type;
		
	}
	public String strength(String strength) {
		this.strength=strength;
		return strength;
		
	
	}
	public float gravity(float gravity) {
		this.gravity=gravity;
		return gravity;
		
	}
	public int moisture(int moisture) {
		this.moisture=moisture;
		return moisture;
		
	}
	public String grain(String grain) {
		this.grain=grain;
		return grain;
		
	}

}
