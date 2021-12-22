package com.xworkz.oneplus;
import com.xworkz.oneplus.dto.EarphoneDTO;

import com.xworkz.oneplus.operation.EarphoneOperation;

public class EarphoneTester {
	public static void main(String args[]) {
	EarphoneOperation operation=new EarphoneOperation();
	EarphoneDTO oneplus9r=new EarphoneDTO();
	oneplus9r.setColor("Black");
	oneplus9r.setProcessor("it");
	oneplus9r.setSound("low");
	oneplus9r.setSeries("pin");
	oneplus9r.setPxl((byte)9);
	operation.add(oneplus9r);
	operation.printAll();
}

}



