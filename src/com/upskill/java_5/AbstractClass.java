package com.upskill.java_5;
// Abstract Class to Abstract Class: One abstract class can inherit (extend) another abstract class. 
//The child abstract class can choose to implement the parent’s abstract methods or leave them abstract for further subclasses to implement.
public abstract class AbstractClass {

	public abstract void icar() ;
	
	public abstract void iwheel();
	
	public abstract void iDoor();
	
	public abstract void iEngine();

	public void car() {
		System.out.println("My car is a tesla");
	}
	public abstract String iName();
	
	public abstract int iWheel();
	
	public abstract boolean iColar();
	
	public abstract boolean iEv();
	
	public int wheel() {
		int wheel = 4;
		return wheel;
	}
	public boolean colar() {
		boolean isColar = true;
		return isColar;
	}
	public boolean ev() {
		boolean ev = true;
		return ev;
	}
	
}

//(Parent)						(Keyword)					(Child)							(Keyword)				(GrandChild)
//-----------------------------------------------------------------------------------------------------------------------------------------
//Class(0)				 		extends						Class(0)
//Abstract Class (A7)			extends						Class (A7-R7=0)
//Interface (A7)				implements					Class (A7-R7=0)
//Interface (A7)				extends						Interface (A7+A3=A10)			implements				Class (A10-R10=0)
//Interface (A7)				implements					Abstract Class (A7-R7=0)
//Abstract Class (A7)			extends						Interface (A7+A3=A10)			implements				Class (A10-R10=0)


	

