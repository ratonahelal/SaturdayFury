package com.upskill.java_4;

public class Singleton {
	
	//singleton is class that can have only one object
	
	//Private construct, it 
	private	 Singleton() {
		
	}
	
	private static Singleton SingletonObj = new Singleton();
 
	protected void demo() {
	System.out.println("Demo method for singleton class");	
	}

	public static Singleton getIntance() {
		return SingletonObj;
	}
}
