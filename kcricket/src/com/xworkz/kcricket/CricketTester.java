package com.xworkz.kcricket;

import com.xworkz.kcricket.dao.CricketDAO;
import com.xworkz.kcricket.dto.CricketDetailsDTO;
import com.xworkz.kcricket.dto.SizeDTO;

public class CricketTester {
	public static void main(String args[]) {
		CricketDetailsDTO detailsdto=new CricketDetailsDTO();
		detailsdto.setTeam("bajaj");
		detailsdto.setJercy("zara");
		detailsdto.setNoofbowlers(2);
		detailsdto.setNoofmembers(40);
		
		
		
		
		SizeDTO dto=new SizeDTO();
		dto.setHeight((float)2.2);
		dto.setLength (4);
		detailsdto.setSize(dto);
		
		CricketDAO dao=new CricketDAO();
		String resp1=dao.insert(detailsdto);
		String resp2=dao.insert(null);
		String resp3=dao.insert(detailsdto);
		
		
		
		System.out.println(resp1);
		System.out.println(resp2);
		System.out.println(resp3);
		
		dao.printAll();
		boolean isdelete=dao.deleteByNoofbowlers(2);
		System.out.println("data deleted"+isdelete);
		dao.printAll();
		
	}
}



