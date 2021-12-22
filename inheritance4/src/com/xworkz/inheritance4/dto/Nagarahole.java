package com.xworkz.inheritance4.dto;


public class Nagarahole {
	public String resorts;
	public String location;
	public String animalname;
	public int nooftrees;
	public int noofanimals;
	
	public Nagarahole() {
		System.out.println("Its a Forest");
	}
	
	public String resorts(String resorts) {
		this.resorts=resorts;
		return resorts;
		
	}
	
	public String location(String location) {
		this.location=location;
		return location;
		
	}
	
	public String animalname(String animalname) {
		this.animalname=animalname;
		return animalname;
		
	}
	
	public int nooftrees(int nooftrees) {
		this.nooftrees=nooftrees;
		return nooftrees;
		
	}
	
	public int noofanimals(int noofanimals) {
		this.noofanimals=noofanimals;
		return noofanimals;
		
	}
}