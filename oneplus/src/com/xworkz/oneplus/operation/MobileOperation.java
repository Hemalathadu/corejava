package com.xworkz.oneplus.operation;
import com.xworkz.oneplus.dto.MobileDTO;

public class MobileOperation {
	MobileDTO[] mobiles=new MobileDTO[5];
	public void save(MobileDTO dto ) {
	mobiles[0]=dto;
	dto.printAll();


	}

}
