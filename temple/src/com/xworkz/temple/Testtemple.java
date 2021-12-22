package com.xworkz.temple;

public class Testtemple {
	public static void main(String args[]) {
		Temple god=new Temple();
		god.add("Tirupathi");
		god.add("Dharmasthala");
		god.add("Ganesha");
		god.printAll();
String res=god.update("Ganesha","Gani");
System.out.println(res);
System.out.println();
god.printAll();
System.out.println();
System.out.println(god.delete());
god.printAll();
	}
}

		
		