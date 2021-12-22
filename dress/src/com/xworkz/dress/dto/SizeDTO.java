package com.xworkz.dress.dto;

public class SizeDTO {
	private int noofgarments;
	private int typeofdresses;
	
	
	public void setNoofgarments(int noofgarments){
		this.noofgarments=noofgarments;
	}
	
	public int getNoofgarments(){
		return noofgarments;
	}
	
	public void setTypeofdresses(int typeofdresses){
		this.typeofdresses=typeofdresses;
	}
	
	public float getTypeofdresses(){
		return typeofdresses;
	}
	
	
	public String getAll() {
		return noofgarments +"\t"  + typeofdresses;
	}
}

