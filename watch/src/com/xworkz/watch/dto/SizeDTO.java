package com.xworkz.watch.dto;

public class SizeDTO {
	private int noofcompanies;
	private float price;
	
	
	public void setNoofcompanies(int noofcompanies){
		this.noofcompanies=noofcompanies;
	}
	
	public int getNoofcompanies(){
		return noofcompanies;
	}
	
	public void setPrice(float price){
		this.price=price;
	}
	
	public float getPrice(){
		return price;
	}
	
	
	public String getAll() {
		return noofcompanies +"\t"  + price;
	}
}





