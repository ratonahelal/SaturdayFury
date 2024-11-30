package com.upskill.assignment_2;

import java.util.Scanner;

// 10. Write a Java program to convert temperature from Fahrenheit to Celsius degree.

public class assignment_2_10 {

	public static void main(String[] args) {
	
		convertTemperature(); 

	}

	public static void convertTemperature() {
		
		Scanner input = new Scanner(System.in);
		double farn,cels;
		System.out.println("Enter the temperature in farengeit - ");
		farn = input.nextDouble();
		cels = (farn - 32)*5/9;
		System.out.println(" Converted temp be " + cels);
		
	}
}
