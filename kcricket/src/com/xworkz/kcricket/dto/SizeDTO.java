package com.xworkz.kcricket.dto;

public class SizeDTO {
	private float height;
	private double length;
	
	public void setHeight(float height) {
		this.height=height;
	}
	public float getHeight() {
		return height;
	}

	public void setLength(double length) {
		this.length=length;
	}
	public double getLength() {
		return length;
	}
	
	
	public String getAll() {
		return height +"\t"  +length;
	}
}



