package com.xworkz.tree;

import com.xworkz.tree.dao.TreeDAO;
import com.xworkz.tree.dto.TreeDetailsDTO;
import com.xworkz.tree.dto.SizeDTO;

public class TreeTester {
public static void main(String args[]) {
		
		TreeDetailsDTO detailsDTO=new TreeDetailsDTO();
		
		detailsDTO.setName("Coconut");
		detailsDTO.setBranches(5);
		detailsDTO.setLeaves("green");
		detailsDTO.setNoofnuts(100);
		
		SizeDTO dto=new SizeDTO();
		dto.setNooffruits(50);
		
		dto.setHeight(9.1f);
		
		detailsDTO.setSize(dto);
		
		TreeDAO dao=new TreeDAO();
		String resp1=dao.insert(detailsDTO);
		String resp2=dao.insert(null);
		String resp3=dao.insert(detailsDTO);
		
		
		
		System.out.println(resp1);
		System.out.println(resp2);
		System.out.println(resp3);
		
		dao.printAll();
		boolean isdelete=dao.deleteByNoofnuts(100);
		System.out.println("data deleted"+isdelete);
		dao.printAll();
		
	}
}

	

