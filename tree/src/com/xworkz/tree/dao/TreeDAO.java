package com.xworkz.tree.dao;

import com.xworkz.tree.dto.TreeDetailsDTO;

public class TreeDAO {
		TreeDetailsDTO[] dtos=new TreeDetailsDTO[5];
		int index=0;
		
		public String insert(TreeDetailsDTO dto) {
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
		
		
		public boolean deleteByNoofnuts(int noofnuts) {
			for(int index=0;index<dtos.length;index++) {
				if(noofnuts==dtos[index].getNoofnuts()) {
					dtos[index]=null;
					return true;
				}
			}
			return false;
		}
		public TreeDetailsDTO getByNoofnuts(int noofnuts) {
			for(int index=0;index<dtos.length;index++) {
				if(noofnuts==dtos[index].getNoofnuts()) {
					return dtos[index];
				}
			}
			return null;
		}
	}





