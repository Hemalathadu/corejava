package com.xworkz.postoffice.dao;
import com.xworkz.postoffice.dto.PostofficeDetailsDTO; 

public class PostofficeDAO {
	PostofficeDetailsDTO[] dtos=new PostofficeDetailsDTO[5];
	int index=0;
	
	public String insert(PostofficeDetailsDTO dto) {
		if(dto==null) {
			return "this is null object";
		}
		else
		{
			dtos[index]=dto;
			System.out.println(dtos[index].getCompany());
			index++;
			return "object added with the company name"+dtos[index-1].getCompany();
		
		}
	}
	public void printAll() {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
				System.out.println(dtos[index].getAll());
			}
		}
	}
	public boolean deleteByAmount(int amount) {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
			if(amount==dtos[index].getAmount()) {
				dtos[index]=null;
				return true;
			}
		}
		}
		return false;
	}
	

}



