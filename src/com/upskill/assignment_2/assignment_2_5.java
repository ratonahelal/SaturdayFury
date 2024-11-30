package com.upskill.assignment_2;

public class assignment_2_5 {

	//5. Write a program in Java to display the multiplication table of (eight)8.
	
	public static void main(String[] args) {
		  int number = 8; 		// The number for which we want the multiplication table

        System.out.println("Multiplication Table of " + number);
	        System.out.println("----------------------");
	        
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " x " + i + " = " + (number * i));
	}

}
}