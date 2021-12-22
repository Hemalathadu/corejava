package com.xworkz.operation;

public class TestOperation {

	public static void main(String[] args) {
		CRUDOperation operation=new CRUDOperation();
		operation.add("Hema");
				operation.add("Apoorva");
						operation.add("Gavi");
								operation.add("kavya");
										operation.add("Hima");
										operation.printAll();
								
										String res=operation.update("Gavi","Harsh");
										System.out.println();
										System.out.println(res);
										System.out.println();
										operation.printAll();
	

	}

}
