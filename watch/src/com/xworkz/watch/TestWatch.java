package com.xworkz.watch;

import com.xworkz.watch.dao.WatchDAO;
import com.xworkz.watch.dto.SizeDTO;
import com.xworkz.watch.dto.WatchDetailsDTO;

public class TestWatch {
public static void main(String args[]) {
		
		WatchDetailsDTO detailsDTO=new WatchDetailsDTO();
		
		detailsDTO.setName("smartwatch");
		detailsDTO.setMotor(5);
		detailsDTO.setCompany("Noise");
		detailsDTO.setNoofdirections(4);
		
		SizeDTO dto=new SizeDTO();
		dto.setNoofcompanies(50);
		
		dto.setPrice(3.1f);
		
		detailsDTO.setSize(dto);
		
		WatchDAO dao=new WatchDAO();
		String resp1=dao.insert(detailsDTO);
		String resp2=dao.insert(null);
		String resp3=dao.insert(detailsDTO);
		
		
		
		System.out.println(resp1);
		System.out.println(resp2);
		System.out.println(resp3);
		
		dao.printAll();
		boolean isdelete=dao.deleteByMotor(5);
		System.out.println("data deleted"+isdelete);
		dao.printAll();
		
	}
}

	




