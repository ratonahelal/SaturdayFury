package com.upskill.java_1;

public class Varibles {

//	Variables in Java
	// Instance OR global variable - Variables declared in Class level, outside
	// method
	// Static variable - variables belong to class and don't required creating
	// object
	// Local variable - variables declared in methods
	// Method parameter - variables used as method parameter

	public String country = "USA"; // Instance OR global variable - Variables declared in Class level, outside
									// method

	public static String region = "America";

	public void ny(String country) {

		String city = "NYC"; // Local variable - variables declared in methods

		System.out.println("---NY Method----");
		System.out.println(country);
		System.out.println(city);
		System.out.println(country);
	}

	public void nj(String country) {

		String city = "Perterson"; // Local variable - variables declared in methods

		System.out.println("---NY Method---");
		System.out.println(country);
		System.out.println(city);
		System.out.println(country);
	}

	public static void main(String[] args) {

		Varibles objName = new Varibles(); // ClassName objClass = new className();
		objName.ny("Queens");
		objName.nj("Essex");

		System.out.println("-- Static/NonStatic--");
		System.out.println(objName.country);
		System.out.println(region);

	}
}