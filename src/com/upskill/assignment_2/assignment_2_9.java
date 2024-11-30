package com.upskill.assignment_2;

//9. Write a program to swap two string variables (Talen, Tech) and display result on the screen. 
  
public class assignment_2_9 {

	public static void main(String[] args) {
	
		String x = "Talen";
		String y = "Tech";		
		String z;
		
		z = x;
		x = y;
		y = z;
		
		System.out.println("swap string " + x);
		System.out.println("swap string " + y);

	}

}
