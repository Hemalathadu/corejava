package com.xworkz.inheritance6.dto;

public class Xworkz {
	public String course;
	public int noofmentors;
	public int noofstudents;
	public int noofhr;
	public String centrename;
	
	public Xworkz() {
		System.out.println("Its a new institute");
		
	}
	public String course(String course) {
		this.course=course;
		return course;
		
	}
	
	public int noofmentors(int noofmentors) {
		this.noofmentors=noofmentors;
		return noofmentors;
		
	}
	
	public int noofstudents(int noofstudents) {
		this.noofstudents=noofstudents;
		return noofstudents;
		
	}
	
	public int noofhr(int noofhr) {
		this.noofhr=noofhr;
		return noofhr;
		
	}
	
	public String centrename(String centrename) {
		this.centrename=centrename;
	return centrename;
	}
}
