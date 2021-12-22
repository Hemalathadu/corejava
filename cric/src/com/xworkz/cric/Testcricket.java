package com.xworkz.cric;
public class Testcricket {
	public static void main(String args[]) {
		CRUDCricket play=new CRUDCricket();
		play.add("Dhoni");
		play.add("Manish Pandey");
		play.add("Rahul");
		play.printAll();
String res=play.update("Manish Pandey","Padikal");
System.out.println(res);
System.out.println();
play.printAll();
System.out.println();
System.out.println(play.delete());
play.printAll();
	}
}

	

