package com.xworkz.watch.dto;


public class WatchDetailsDTO {
	private String name;
	private int motor;
	private String company;
	private int noofdirections;
	private SizeDTO size;
	
	
	public void setName(String name){
    	this.name=name;
    }
	
	public String getName() {
		return name;
	}
	
	
	 public void setMotor(int motor){
		   this.motor=motor;
	   }

    public int getmotor(){
    	return motor;
    }
    
    
    public  void setCompany(String company){
   	 this.company=company;
     }
      public String getCompany(){
	   return company;
   }
      
      
      public void setNoofdirections(int noofdirections){
    		 this.noofdirections=noofdirections;
    	  }
  public int getNoofdirections(){
	  return noofdirections;
  }
  
 public void setSize(SizeDTO size) {
		this.size=size;
	}
	public SizeDTO getSize() {
		return size;
	}
	public String getAll() {
		return name +"\t" +motor +"\t" +company +"\t" +noofdirections +"\t" +size.getAll();
	}
 
}






