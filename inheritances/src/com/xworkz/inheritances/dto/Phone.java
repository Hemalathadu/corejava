package com.xworkz.inheritances.dto;

public class Phone extends Vivo {
	public String type;
	public String sensors;
	public int RAM;
	public int battery;
	public int camera;

	public Phone() {
		System.out.println("phone is useful");
	}
	
	public String type(String type) {
		this.type=type;
		return type;
	}
	public String sensors(String sensors) {
		this.sensors=sensors;
		return sensors;
	}
	public int RAM(int RAM) {
		this.RAM=RAM;
		return RAM;
	}
	public int battery(int battery) {
		this.battery=battery;
		return battery;
	}
	public int camera(int camera) {
		this.camera=camera;
		return camera;
	}
	
	
}
