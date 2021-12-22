package com.xworkz.oneplus.dto;

public class TelevisionDTO {
	int price;
	String color;
	String processor;
	String sound;
	String series;
	byte pxl;
	public TelevisionDTO() {
		
	}
	public TelevisionDTO( int price,String color,String processor,String sound,String series,byte pxl){
	this.price=price;;
	this.color=color;
	this.processor=processor;
	this.sound=sound;
	this.series=series;
	this.pxl=pxl;
}
public void printAll() {
	System.out.println(price +"\t" +color +"\t" +processor +"\t" +sound +"\t" +series +"\t" +pxl +"\t" );


	}

}
