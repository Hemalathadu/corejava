package com.xworkz.oneplus.dto;
public class EarphoneDTO {
	private int price;
	private String color;
	private String processor;
	 private String sound;
	private String series;
	private byte pxl;
	public EarphoneDTO() {
		
	}
	public void setPrice(int price)
	{
	this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	public void setColor(String color)
	{
	this.color=color;
	}
	public String getColor()
	{
		return color;
	}
	public void setProcessor(String processor)
	{	
	this.processor=processor;
	}
	public String getProcessor()
	{
		return processor;
	}
	public void setSound(String sound)
	{
	this.sound=sound;
	}
	public String getSound()
	{
		return sound;
	}
	public void setSeries(String series)
	{
		this.series=series;
	}
	public String getSeries()
	{
		return series;
	}
	public void setPxl(byte pxl)
	{
	this.pxl=pxl;
	}
	public byte getPxl()
	{
		return pxl;
	}
}



