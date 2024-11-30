package com.upskill.java_5;
// Abstract Class to Class: A child class inherits (extends) an abstract class and must implement 
//its abstract methods (if not already implemented in an intermediary class).
public class AbstractClassImplementaion extends AbstractClass {

	@Override
	public void icar() {
		System.out.println("My car is Audi");
		
	}

	@Override
	public void iwheel() {
		System.out.println("My car has 4 Wheel");
		
	}

	@Override
	public void iDoor() {
		System.out.println("My car has 4 Door");
		
	}

	@Override
	public void iEngine() {
		System.out.println("My car has Motors");	
		
	}

	@Override
	public String iName() {
		String name = "Upskill";
		return name;
	}

	@Override
	public int iWheel() {
		int wheel = 4;
		return 0;
	}

	@Override
	public boolean iColar() {
		boolean colar = false;
		return colar;
	}

	@Override
	public boolean iEv() {
		boolean ev = false;
		return ev;
	}

}
