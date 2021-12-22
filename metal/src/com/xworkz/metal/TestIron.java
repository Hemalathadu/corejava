package com.xworkz.metal;

public class TestIron {
	public static void main(String[] args) {

Metal metal = new Metal();

System.out.println("Color :" + metal.color);
System.out.println();

System.out.println("isDuctile :" + metal.isductile);
System.out.println();

System.out.println("Price :" + metal.price);
System.out.println();

System.out.println("Size :" + metal.size);
System.out.println();

System.out.println("Weight :" + metal.weight);
System.out.println();

Iron iron = new Iron((byte) 1, "Ag", 961.8f, 1000, "Iron", true, 65000.50, 10, "Palladium", (byte) 47);
			
System.out.println("Color :" + iron.color);
System.out.println();

System.out.println("isDuctile :" + iron.isductile);
System.out.println();

System.out.println("Price :" + iron.price);
System.out.println();

System.out.println("Size :" + iron.size);
System.out.println();

System.out.println("Weight :" + iron.weight);
System.out.println();

System.out.println("Catalyst :" + iron.catalyst);
System.out.println();

System.out.println("Chemical Name :" + iron.chemicalName);
System.out.println();

System.out.println("Melting Point :" + iron.meltingPoint);
System.out.println();

System.out.println("Number of Electrons :" + iron.electrons);
System.out.println();

System.out.println("Atomic Number :" + iron.atomicNumber);
System.out.println();

Metal metal2 = new Iron((byte) 1, "Ag", 961.8f, 1000, "Iron", true, 65000.50, 10, "Palladium", (byte) 47);

System.out.println("Down_Casting Values");
System.out.println("-");

System.out.println("Color :" + metal2.color);
System.out.println();

System.out.println("isDuctile :" + metal2.isductile);
System.out.println();

System.out.println("Price :" + metal2.price);
System.out.println();

System.out.println("Size :" + metal2.size);
System.out.println();

System.out.println("Weight :" + metal2.weight);
System.out.println();

Iron iron1 = (Iron) metal2;

System.out.println("Up_Casting Values");
System.out.println("-");

System.out.println("Color :" + iron1.color);
System.out.println();

System.out.println("isDuctile :" + iron1.isductile);
System.out.println();

System.out.println("Price :" + iron1.price);
System.out.println();

System.out.println("Size :" + iron1.size);
System.out.println();

System.out.println("Weight :" + iron1.weight);
System.out.println();

System.out.println("Catalyst :" + iron1.catalyst);
System.out.println();

System.out.println("Chemical Name :" + iron1.chemicalName);
System.out.println();

System.out.println("Melting Point :" + iron1.meltingPoint);
System.out.println();

System.out.println("Atomic Number :" + iron1.atomicNumber);
System.out.println();

System.out.println("Number of Electrons :" + iron1.electrons);

					}

				}

			

			


