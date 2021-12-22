package com.xworkz.inheritance7.dto;



public class Indigo {
	public String boilingpoint;
	public int density;
	public int meltingpoint;
	public String appearance;
	public String compounds;
	
	public Indigo() {
		System.out.println("Its Indigo");
	}
	
	public String boilingpoint(String boilingpoint) {
		this.boilingpoint=boilingpoint;
		return boilingpoint;
		
	}
	
	public int density(int density) {
		this.density=density;;
		return density;
		
	}
	
	public int meltingpoint(int meltingpoint) {
		this.meltingpoint=meltingpoint;
		return meltingpoint;
		
	}
	
	public String appearance(String appearance) {
		this.appearance=appearance;
		return appearance;
		
	}
	
	public String compounds(String compounds) {
		this.compounds=compounds;
		return compounds;
		
	}
	}


