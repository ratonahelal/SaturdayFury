package com.upskill.assignment_2;

//7.  You are given two integer number (a=25, b=30), write a program to swap them and 
//display result on the screen. 

public class assignment_2_7 {

	public static void main(String[] args) {
		
		int a = 25;
		int b = 30;
		int result ;
		
		result = a;
		a = b;
		b = result;

		System.out.println("Swap int of a is " + a);
		System.out.println("Swap int of a is " + b);
		
	}

}
