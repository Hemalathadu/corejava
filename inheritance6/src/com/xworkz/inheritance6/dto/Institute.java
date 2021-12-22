package com.xworkz.inheritance6.dto;

public class Institute extends Xworkz {
public String name;
public String educationinstitute;
public String certification;
public String location;
public String management;

public Institute() {
	System.out.println("Institue is good");
}

public String name(String name) {
	this.name=name;
	return name;
	
}

public String educationinstitute(String educationinstitute) {
	this.educationinstitute=educationinstitute;
	return educationinstitute;
	
}

public String certification(String certification) {
	this.certification=certification;
	return certification;
	
}

public String location(String location) {
	this.location=location;
	return location;
	
}

public String management(String management) {
	this.management=management;
	return management;
	
}

}