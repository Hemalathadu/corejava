package com.xworkz.dress;

import com.xworkz.dress.dao.DressDAO;
import com.xworkz.dress.dto.SizeDTO;
import com.xworkz.dress.dto.DressDetailsDTO;

public class TestDress {
public static void main(String args[]) {
		
		DressDetailsDTO detailsDTO=new DressDetailsDTO();
		
		detailsDTO.setName("Jumpsuit");
		detailsDTO.setQuality("good");
		detailsDTO.setCompany("Cherrokee");
		detailsDTO.setNoofprice(1500);
		
		SizeDTO dto=new SizeDTO();
		dto.setNoofgarments(10);
		
		dto.setTypeofdresses(12);
		
		detailsDTO.setSize(dto);
		
		DressDAO dao=new DressDAO();
		String resp1=dao.insert(detailsDTO);
		String resp2=dao.insert(null);
		String resp3=dao.insert(detailsDTO);
		
		
		
		System.out.println(resp1);
		System.out.println(resp2);
		System.out.println(resp3);
		
		dao.printAll();
		boolean isdelete=dao.deleteByQuality("good");
		System.out.println("data deleted"+isdelete);
		dao.printAll();
		
	}
}

	







