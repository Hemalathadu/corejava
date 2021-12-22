package com.xworkz.inheritance3.dto;

public class Developer {
	public int noofdevelopers;
	public int license;
	public String estate;
	public String landmark;
	public String service;
	
	public Developer() {
		System.out.println("Its a Developer");
	}
	
	public int noofdevelopers(int noofdevelopers) {
		this.noofdevelopers=noofdevelopers;
		return noofdevelopers;
	}
	
	public int license(int license) {
		this.license=license;
		return license;
	}
	
	public String estate(String estate) {
		this.estate=estate;
		return estate;
	}
	
	public String landmark(String landmark) {
		this.landmark=landmark;
		return landmark;
	}
	
	public String service(String service) {
		this.service=service;
		return service;
	}
	
	

}