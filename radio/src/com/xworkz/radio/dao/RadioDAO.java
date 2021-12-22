package com.xworkz.radio.dao;
import com.xworkz.radio.dto.RadioDetailsDTO;

public class RadioDAO {
	RadioDetailsDTO[] dtos=new RadioDetailsDTO[5];
	int index=0;
	
	public String insert(RadioDetailsDTO dto) {
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
	public boolean deleteByPrice(int price) {
		for(int index=0;index<dtos.length;index++) {
			if(price==dtos[index].getPrice()) {
				dtos[index]=null;
				return true;
			}
		}
		return false;
	}
	public RadioDetailsDTO getByPrice(int price) {
		for(int index=0;index<dtos.length;index++) {
			if(price==dtos[index].getPrice()) {
				return dtos[index];
			}
		}
		return null;
	}
	public RadioDetailsDTO getByWidth(double width) {
		for(int index=0;index<dtos.length;index++) {
			if(width==dtos[index].getSize().getWidth()) {
				return dtos[index];
			}
		}
		return null;
	}
	
	public RadioDetailsDTO getByColor(String color) {
		for(int index=0;index<dtos.length;index++) {
			if(color==dtos[index].getColor()) {
				return dtos[index];
			}
		}
		return null;
			

	}
	public boolean deleteByPrice(int price) {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(price==dtos[index].getPrice()) {
					dtos[index]=null;
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean deleteByCompany(String company) {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(price==dtos[index].getPrice()) {
					dtos[index]=null;
					return true;
				}
			}
		}
		return false;
		
	
	

				}
			}
		}
	}
}
		
