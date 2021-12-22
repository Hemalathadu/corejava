package com.xworkz.dress.dao;

import com.xworkz.dress.dto.DressDetailsDTO;

public class DressDAO {
	DressDetailsDTO[] dtos=new DressDetailsDTO[5];
	int index=0;
	
	public String insert(DressDetailsDTO dto) {
		if(dto==null) {
			return "this is null object";
		}
		else
		{
			dtos[index]=dto;
			System.out.println(dtos[index].getName());
			index++;
			return "object added with the name"+dtos [index-1].getName();
		}
	}
	public void printAll() {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
				System.out.println(dtos[index].getAll());
			}
		}
	}
	
	
	public boolean deleteByQuality(String quality) {
		for(int index=0;index<dtos.length;index++) {
			if(quality==dtos[index].getQuality()) {
				dtos[index]=null;
				return true;
			}
		}
		return false;
	}
	public DressDetailsDTO getByQuality(String quality) {
		for(int index=0;index<dtos.length;index++) {
			if(quality==dtos[index].getQuality()) {
				return dtos[index];
			}
		}
		return null;
	}
}






	





