package com.xorkz.butterfly;

public class CRUDButter {
	String[]names=new String[3];
	int index=0;
	
	public void add(String name) {
		if(index<names.length) {
			names[index]=name;
			index++;
		}
	}
	public void printAll() {
		for(int index=0;index<names.length;index++) {
			System.out.println(names[index++]);
			
		}
	}
	public String update(String oldName,String newName)
	{
		for(int index=0;index<names.length;index++)
		{
			if(names[index]==oldName)
			{
				names[index]=newName;
				return "Data Updated";
			}
			}
		return "Data not Updated";
	}
		public String delete() {
			for(int index=0;index<names.length;index++) {
				if(names[index].equals("legs")) {
					names[index]=null;
					return "value deleted";
				}
			}
			return "value not deleted";
		}
}
