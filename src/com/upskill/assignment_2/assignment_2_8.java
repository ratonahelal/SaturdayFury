package com.upskill.assignment_2;

// 8. Write Java Program to display Factorial of Number 7.

public class assignment_2_8 {

	public static void main(String[] args) {
	
		int num = 7;
		int Factorial = 1;
		
		for (int i = 1; i<=num; i++ ) {
			Factorial *= i;
		}
		System.out.println("Factorial of " + num + "is: " + Factorial);
		
	}

}
