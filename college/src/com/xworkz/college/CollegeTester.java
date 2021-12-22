package com.xworkz.college;

import com.xworkz.college.dto.CollegeDetailsDTO;
import com.xworkz.college.dto.SizeDTO;
import com.xworkz.college.dao.CollegeDAO;

public class CollegeTester {
	
	public static void main(String args[]) {
		
		CollegeDetailsDTO detailsDTO=new CollegeDetailsDTO();
		
		detailsDTO.setName("CIT");
		detailsDTO.setId(15);
		detailsDTO.setStructure("good");
		detailsDTO.setFees(0);
		
		SizeDTO dto=new SizeDTO();
		dto.setSalary(50.004f);
		
		dto.setHeight(9.1f);
		
		detailsDTO.setSize(dto);
		
		CollegeDAO dao=new CollegeDAO();
		String resp1=dao.insert(detailsDTO);
		String resp2=dao.insert(null);
		String resp3=dao.insert(detailsDTO);
		
		
		
		System.out.println(resp1);
		System.out.println(resp2);
		System.out.println(resp3);
		
		dao.printAll();
		boolean isdelete=dao.deleteByFees(0);
		System.out.println("data deleted"+isdelete);
		dao.printAll();
		
	}
}
