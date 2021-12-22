package com.xworkz.transformation;



public class TestTransportation {
	public static void main(String[] args) {
		Transportation vehicle=new Transportation();
		vehicle.add("Train");
			vehicle.add("Drone");
						vehicle.add("helicophter");
							
										vehicle.printAll();
								
										String res=vehicle.update("train","metro");
										
										System.out.println(res);
										System.out.println();
										vehicle.printAll();
										System.out.println();
										System.out.println(vehicle.delete());
										vehicle.printAll();

	}

}



