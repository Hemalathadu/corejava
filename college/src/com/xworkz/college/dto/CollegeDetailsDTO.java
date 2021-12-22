package com.xworkz.college.dto;


public class CollegeDetailsDTO {
	private String name;
	private int id;
	private String structure;
	private int fees;
	private SizeDTO size;
	
	
	public void setName(String name){
    	this.name=name;
    }
	
	public String getName() {
		return name;
	}
	
	
	 public void setId(int id){
		   this.id=id;
	   }

    public int getId(){
    	return id;
    }
    
    
    public  void setStructure(String structure){
   	 this.structure=structure;
     }
      public String getStructure(){
	   return structure;
   }
      
      
      public void setFees(int fees){
    		 this.fees=fees;
    	  }
  public int getFees(){
	  return fees;
  }
  
 public void setSize(SizeDTO size) {
		this.size=size;
	}
	public SizeDTO getSize() {
		return size;
	}
	public String getAll() {
		return name +"\t" +id +"\t" +structure +"\t" +fees +"\t" +size.getAll();
	}
 
}
