package com.xworkz.hero;

import com.xworkz.hero.dao.HeroDAO;
import com.xworkz.hero.dto.HeroDetailsDTO;
import com.xworkz.hero.dto.SizeDTO;

public class HeroTester {
	public static void main(String args[]) {
		HeroDetailsDTO detailsdto=new HeroDetailsDTO();
		detailsdto.setName("appu");
		detailsdto.setColor("black");
		detailsdto.setHand(2);
		detailsdto.setNoofeyes(3);
		
		
		
		
		SizeDTO dto=new SizeDTO();
		dto.setHeight((float)5.8);
		dto.setWeight (65);
		detailsdto.setSize(dto);
		
		HeroDAO dao=new HeroDAO();
		String resp1=dao.insert(detailsdto);
		String resp2=dao.insert(null);
		String resp3=dao.insert(detailsdto);
		
		
		
		System.out.println(resp1);
		System.out.println(resp2);
		System.out.println(resp3);
		
		dao.printAll();
		boolean isdelete=dao.deleteByHand(2);
		System.out.println("data deleted"+isdelete);
		dao.printAll();
		
	}
}
