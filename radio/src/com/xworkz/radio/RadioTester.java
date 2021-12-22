package com.xworkz.radio;
import com.xworkz.radio.dao.RadioDAO;
import com.xworkz.radio.dto.RadioDetailsDTO;
import com.xworkz.radio.dto.SizeDTO;

public class RadioTester {

	public static void main(String args[]) {
		RadioDetailsDTO detailsdto=new RadioDetailsDTO();
		detailsdto.setCompany("bajaj");
		detailsdto.setPrice(500);
		detailsdto.setcolor("brown");
		detailsdto.setNoofstations((byte)40);
		
		
		
		
		SizeDTO dto=new SizeDTO();
		dto.setHeight((float)20.02);
		dto.setLength(42.32);
		dto.setWidth(25.21);
		detailsdto.setSize(dto);
		
		RadioDAO dao=new RadioDAO();
		String resp1=dao.insert(detailsdto);
		String resp2=dao.insert(null);
		String resp3=dao.insert(detailsdto);
		
		
		
		System.out.println(resp1);
		System.out.println(resp2);
		System.out.println(resp3);
		
		RadioDetailsDTO detailsDTO=dao.updatePriceByColor(750,"brown");
		System.out.println(detailsDTO.getAll());
		
		RadioDetailsDTO detailsDTO1=dao.updateCompanyByColor("bajaj","brown");
		System.out.println(detailsDTO1.getAll());
		
		dao.printAll();
		boolean isdelete=dao.deleteByPrice(500);
		System.out.println("data deleted"+isdelete);
		dao.printAll();
		
	}
}
