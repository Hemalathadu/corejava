package com.xworkz.metal;

public class Iron extends Metal{
	
public String chemicalName;
public float meltingPoint; 
public String catalyst; 
public byte electrons;
public byte atomicNumber;

public Iron() {
System.out.println("Silver : Invoking Default Contructor");
		}

public Iron(byte electrons,String chemicalName,float meltingPoint,double weight, String color, boolean isductile, double price, float size, String catalyst, byte automicNumber) {
	
	super(weight, color, isductile, price, size);
	
	this.meltingPoint = meltingPoint;
	this.chemicalName = chemicalName;
	this.catalyst = catalyst;
	this.atomicNumber = atomicNumber;
	this.electrons = electrons;
	
System.out.println("Iron : Invoking Param Contructor");
		}

	}




