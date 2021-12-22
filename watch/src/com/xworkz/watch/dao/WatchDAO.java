package com.xworkz.watch.dao;

import com.xworkz.watch.dto.WatchDetailsDTO;

public class WatchDAO {
	WatchDetailsDTO[] dtos=new WatchDetailsDTO[5];
	int index=0;
	
	public String insert(WatchDetailsDTO dto) {
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
	
	
	public boolean deleteByMotor(int motor) {
		for(int index=0;index<dtos.length;index++) {
			if(motor==dtos[index].getmotor()) {
				dtos[index]=null;
				return true;
			}
		}
		return false;
	}
	public WatchDetailsDTO getByMotor(int motor) {
		for(int index=0;index<dtos.length;index++) {
			if(motor==dtos[index].getmotor()) {
				return dtos[index];
			}
		}
		return null;
	}
}






	


