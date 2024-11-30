package com.upskill.java_3;

public class Encapsulation {
	
	// Encapsulation used to hide the data using setter and getter method
	
	private String name = "upskill";  				// Write & Read
	private int ssn = 1234567;						// write only
	private String userName = "ratonahelal";		// Read only
	
	
	// Setter Method - name							// set the data, Write
	public void setName(String value) {
		name = value;
	}
	
	//Getter Method - name							// set the data, Read			
	public String getName() {
		return name;
	}
	
	// Setter Method - ssn							// // set the data, Write
	public void setSSN(int value) {
		ssn = value;
	}
	

	//Getter Method - username							// set the data, Read			
	public String getUserName() {
		return userName;
	}
	
	
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		System.out.println(obj.getName());
		obj.setName("Raton");
		System.out.println(obj.getName());
		
		
	}

}
