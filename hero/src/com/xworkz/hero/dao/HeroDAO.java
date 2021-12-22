package com.xworkz.hero.dao;

import com.xworkz.hero.dto.HeroDetailsDTO;

public class HeroDAO {
	HeroDetailsDTO[] dtos=new HeroDetailsDTO[5];
	int index=0;
	
	public String insert(HeroDetailsDTO dto) {
		if(dto==null) {
			return "this is null object";
		}
		else
		{
			dtos[index]=dto;
			System.out.println(dtos[index].getName());
			index++;
			return "object added with the company name"+dtos[index-1].getName();
		
		}
	}
	public void printAll() {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
				System.out.println(dtos[index].getAll());
			}
		}
	}
	public boolean deleteByHand(int hand) {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
			if(hand==dtos[index].getHand()) {
				dtos[index]=null;
				return true;
			}
		}
		}
		return false;
	}
	

}






