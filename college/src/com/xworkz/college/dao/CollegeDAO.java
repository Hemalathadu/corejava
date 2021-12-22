package com.xworkz.college.dao;

import com.xworkz.college.dto.CollegeDetailsDTO;

public class CollegeDAO {
	CollegeDetailsDTO[] dtos=new CollegeDetailsDTO[5];
	int index=0;
	
	public String insert(CollegeDetailsDTO dto) {
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
	
	
	public boolean deleteByFees(int fees) {
		for(int index=0;index<dtos.length;index++) {
			if(fees==dtos[index].getFees()) {
				dtos[index]=null;
				return true;
			}
		}
		return false;
	}
	public CollegeDetailsDTO getByFees(int fees) {
		for(int index=0;index<dtos.length;index++) {
			if(fees==dtos[index].getFees()) {
				return dtos[index];
			}
		}
		return null;
	}
}


