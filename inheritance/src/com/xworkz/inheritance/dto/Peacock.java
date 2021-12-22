package com.xworkz.inheritance.dto;

public class Peacock extends Bird {
	public int nooffeathers;
	public String gender;
	public int lifespan;
	public String food;
	public float height;
	
	public Peacock(){
		System.out.println("its a peacock");
	}

	
	public int nooffeathers(int nooffeathers) {
		this.nooffeathers=nooffeathers;
		return nooffeathers;
	}
	
	public String gender(String gender) {
		this.gender=gender;
		return gender;
	}
	
	public int lifespan(int lifespan) {
		this.lifespan=lifespan;
		return lifespan;
	}
	
	public String food(String food) {
		this.food=food;
		return food;
	}
		
	public int height(int height) {
		this.height=height;
		return height;
	}
	}
	


