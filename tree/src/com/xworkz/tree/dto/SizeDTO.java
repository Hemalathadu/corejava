package com.xworkz.tree.dto;

public class SizeDTO {
	private int nooffruits;
	private float height;
	
	
	public void setNooffruits(int nooffruits){
		this.nooffruits=nooffruits;
	}
	
	public float getNooffruits(){
		return nooffruits;
	}
	
	public void setHeight(float height){
		this.height=height;
	}
	
	public float getHeight(){
		return height;
	}
	
	
	public String getAll() {
		return nooffruits +"\t"  + height;
	}
}


