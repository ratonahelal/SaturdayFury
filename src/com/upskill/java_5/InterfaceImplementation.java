package com.upskill.java_5;
//Interface to Class: A class implements an interface using the implements keyword and must provide implementations for all methods of the interface.

public  abstract class InterfaceImplementation implements Interface{

	@Override
	public void icar() {
	
		System.out.println("My car is BMW");
		
	}

	@Override
	public void iwheel() {
		System.out.println("My car has 6 Wheel");
		
	}

	@Override
	public void iDoor() {
		System.out.println("My car has 4 Door");
		
	}

	@Override
	public void iEngine() {
		System.out.println("My car has 20hp");
		
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


