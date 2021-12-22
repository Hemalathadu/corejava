package com.xworkz.oneplus;
import com.xworkz.oneplus.dto.MobileDTO;
import com.xworkz.oneplus.operation.MobileOperation;

public class MobileTester {
	public static void main(String args[]) {
	MobileOperation operation=new MobileOperation();
	MobileDTO oneplus9r=new MobileDTO((byte)12,"sa870","9r","Black",(int)37000,(byte)40,(byte)4);
	operation.save(oneplus9r);
}

}
