package com.xworkz.hero.dto;

public class SizeDTO {
	private float height;
	private float weight;
	
	public void setHeight(float height) {
		this.height=height;
	}
	public float getHeight() {
		return height;
	}

	public void setWeight(float weight) {
		this.weight=weight;
	}
	public float getWeight() {
		return weight;
	}
	
	
	public String getAll() {
		return height +"\t"  +weight;
	}
}






