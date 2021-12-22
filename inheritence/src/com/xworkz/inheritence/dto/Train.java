package com.xworkz.inheritence.dto;

public class Train extends Metro {
public String name;
public String type;
public int noofcatterings;
public int engine;
public int noofpassengers;

public Train() {
System.out.println("its a metro");
}

public String name(String name) {
this.name=name;
return name;
}

public String type(String type) {
	this.type=type;
	return type;
}

public int noofcatterings(int catterings) {
	this.noofcatterings=noofcatterings;
	return noofcatterings;
}

public int engine(int engine) {
	this.engine=engine;
	return engine;
}

public int noofpassengers(int noofpassengers) {
	this.noofpassengers=noofpassengers;
	return noofpassengers;
}
}


