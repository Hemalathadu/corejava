package com.xworkz.postoffice;
import com.xworkz.postoffice.dao.PostofficeDAO;
import com.xworkz.postoffice.dto.PostofficeDetailsDTO;
import com.xworkz.postoffice.dto.SizeDTO;

public class TestPostoffice {

	public static void main(String args[]) {
		PostofficeDetailsDTO detailsdto=new PostofficeDetailsDTO();
		detailsdto.setCompany("puzzle");
		detailsdto.setAmount(20000);
		detailsdto.setName("xyz");
		detailsdto.setNoofbranch((byte)40);
		
		
		
		
		SizeDTO dto=new SizeDTO();
		dto.setSalary((float)20.02);
		dto.setPrice (42.32);
		detailsdto.setSize(dto);
		
		PostofficeDAO dao=new PostofficeDAO();
		String resp1=dao.insert(detailsdto);
		String resp2=dao.insert(null);
		String resp3=dao.insert(detailsdto);
		
		
		
		System.out.println(resp1);
		System.out.println(resp2);
		System.out.println(resp3);
		
		dao.printAll();
	boolean isdelete=dao.deleteByAmount(500);
		System.out.println("data deleted "+isdelete);
		dao.printAll();
		
	}
}
