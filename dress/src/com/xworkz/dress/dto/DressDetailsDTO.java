package com.xworkz.dress.dto;

import com.xworkz.dress.dto.SizeDTO;

public class DressDetailsDTO {
	private String name;
	private String quality;
	private String company;
	private int noofprice;
	private SizeDTO size;
	
	
	public void setName(String name){
    	this.name=name;
    }
	
	public String getName() {
		return name;
	}
	
	
	 public void setQuality(String quality){
		   this.quality=quality;
	   }

    public String getQuality(){
    	return quality;
    }
    
    
    public  void setCompany(String company){
   	 this.company=company;
     }
      public String getCompany(){
	   return company;
   }
      
      
      public void setNoofprice(int noofprice){
    		 this.noofprice=noofprice;
    	  }
  public int getNoofprice(){
	  return noofprice;
  }
  
 public void setSize(SizeDTO size) {
		this.size=size;
	}
	public SizeDTO getSize() {
		return size;
	}
	public String getAll() {
		return name +"\t" +quality +"\t" +company +"\t" +noofprice +"\t" +size.getAll();
	}
 
}









