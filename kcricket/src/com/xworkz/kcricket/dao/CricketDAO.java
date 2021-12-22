package com.xworkz.kcricket.dao;

import com.xworkz.kcricket.dto.CricketDetailsDTO;

public class CricketDAO {
		CricketDetailsDTO[] dtos=new CricketDetailsDTO[5];
		int index=0;
		
		public String insert(CricketDetailsDTO dto) {
			if(dto==null) {
				return "this is null object";
			}
			else
			{
				dtos[index]=dto;
				System.out.println(dtos[index].getTeam());
				index++;
				return "object added with the company name"+dtos[index-1].getTeam();
			
			}
		}
		public void printAll() {
			for(int index=0;index<dtos.length;index++) {
				if(dtos[index]!=null) {
					System.out.println(dtos[index].getAll());
				}
			}
		}
		public boolean deleteByNoofbowlers(int noofbowlers) {
			for(int index=0;index<dtos.length;index++) {
				if(dtos[index]!=null) {
				if(noofbowlers==dtos[index].getNoofbowlers()) {
					dtos[index]=null;
					return true;
				}
			}
			}
			return false;
		}
		

	}



