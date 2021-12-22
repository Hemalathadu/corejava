package com.xworkz.kcricket.dto;


public class CricketDetailsDTO {
	private String team;
	private String jercy;
   private int noofbowlers;
	private int noofmembers  ;
	private SizeDTO size;
	
	public void setTeam(String team) {
		this.team=team;
		}
	public String getTeam() {
		return team;
	}
	
	public void setJercy(String jercy) {
		this.jercy=jercy;
	}
	public String getJercy() {
		return jercy;
	}
	
	public void setNoofbowlers(int noofbowlers) {
		this.noofbowlers=noofbowlers;
	}
	public int getNoofbowlers() {
		return noofbowlers;
	}
	
	public void setNoofmembers(int noofmembers) {
		this.noofmembers=noofmembers;
		
	}
	public int getNoofmembers() {
		return noofmembers;
	}
	
	public void setSize(SizeDTO size) {
		this.size=size;
	}
	public SizeDTO getSize() {
		return size;
	}
	
	public String getAll() {
		return team +"\t" +jercy +"\t" +noofbowlers +"\t" +noofmembers +"\t" + size.getAll();
		
	}
	}
    
