package com.xorkz.butterfly;

public class TestButter {

		public static void main(String args[]) {
			CRUDButter fly=new CRUDButter();
			fly.add("wings");
			fly.add("colorful");
			fly.add("legs");
			fly.printAll();
	String res=fly.update("legs","leg");
	System.out.println(res);
	System.out.println();
	fly.printAll();
	System.out.println();
	System.out.println(fly.delete());
	fly.printAll();
		}
  }
