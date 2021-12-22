package com.xworkz.oneplus.operation;
import com.xworkz.oneplus.dto.EarphoneDTO;

public class EarphoneOperation {
	EarphoneDTO[] earphone=new EarphoneDTO[6];
	int index=0;
	public void add(EarphoneDTO dto ) {
		System.out.println("Adding Data");
	earphone[0]= dto;
		index++;
		System.out.println("saved data");
	}

	
	public void printAll()
	{
		for(int index=0;index<earphone.length;index++)
		{
			if(earphone[index]!=null){
{
	System.out.println(earphone[index].getPrice()+"\t" +
    earphone[index].getColor()+"\t"+
	earphone[index].getProcessor()+"\t"+ 
	earphone[index].getSound()+"\t"+
	earphone[index].getSeries()+"\t"+ 
	earphone[index].getPxl() );
	
}
		}
    }
	}
}
		
