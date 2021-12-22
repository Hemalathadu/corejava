package com.xworkz.inheritance5.dto;

public class Table {
public int length;
public int width;
public int breadth;
public String shape;
public String color;

public Table() {
	System.out.println("Its a table");
}

public int length(int length) {
	this.length=length;
	return length;
}

public int width(int width) {
	this.width=width;
	return width;
}

public int breadth(int breadth) {
	this.breadth=breadth;
	return breadth;
}

public String shape(String shape) {
	this.shape=shape;;
	return shape;
}

public String color(String color) {
	this.color=color;
	return color;
}

}
