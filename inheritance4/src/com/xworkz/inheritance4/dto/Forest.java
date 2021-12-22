package com.xworkz.inheritance4.dto;

public class Forest extends Nagarahole {
	String name;
	String structure;
	String cultivation;
	String type;
	int noofelephants;
	
	public Forest() {
		System.out.println("Forest is soo beautiful");
	}
	
	public String name(String name) {
		this.name=name;
		return name;
		
	}
	public String structure(String structure) {
		this.structure=structure;
		return structure;
		
	}
	public String cultivation(String cultivation) {
		this.cultivation=cultivation;
		return cultivation;
		
	}
	public String type(String type) {
		this.type=type;
		return type;
		
	}
	public int noofelephants(int noofelephants) {
		this.noofelephants=noofelephants;
		return noofelephants;
		
	}

}
