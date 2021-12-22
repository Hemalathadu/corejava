package com.xworkz.tree.dto;

public class TreeDetailsDTO {
	private String name;
	private int branches;
	private String leaves;
	private int noofnuts;
	private SizeDTO size;
	
	
	public void setName(String name){
    	this.name=name;
    }
	
	public String getName() {
		return name;
	}
	
	
	 public void setBranches(int branches){
		   this.branches=branches;
	   }

    public int getBranches(){
    	return branches;
    }
    
    
    public  void setLeaves(String leaves){
   	 this.leaves=leaves;
     }
      public String getLeaves(){
	   return leaves;
   }
      
      
      public void setNoofnuts(int noofnuts){
    		 this.noofnuts=noofnuts;
    	  }
  public int getNoofnuts(){
	  return noofnuts;
  }
  
 public void setSize(SizeDTO size) {
		this.size=size;
	}
	public SizeDTO getSize() {
		return size;
	}
	public String getAll() {
		return name +"\t" +branches +"\t" +leaves +"\t" +noofnuts +"\t" +size.getAll();
	}
 
}



