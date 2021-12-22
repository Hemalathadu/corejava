package com.xworkz.oneplus.dto;

 public class MobileDTO {
	int price;
	String color;
	String processor;
	byte ram;
	String series;
	byte pxl;
	byte noofcamera;
	public MobileDTO() {
		
	}
	public MobileDTO( byte ram,String series,String processor,String color,int price,byte pxl,byte noofcamera){
	this.ram=ram;
	this.series=series;
	this.processor=processor;
	this.color=color;
	this.price=price;
	this.pxl=pxl;
	this.noofcamera=noofcamera;
}
 public void printAll() {
	System.out.println(series +"\t" +price +"\t" +processor +"\t" +color +"\t" +ram +"\t" +pxl +"\t" +noofcamera +"\t");


	}

}
