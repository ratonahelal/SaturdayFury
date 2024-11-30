package com.upskill.assignment_1;

public class Assignment_1_1 {
	/*
	 * Problem 01: A triangle's three arms are: 5,7 and 11 inches. Write a method to
	 * display the perimeter of triangle in console output.
	 */

	public static void main(String[] args) {
		triangleperimeter();
	}

	public static void triangleperimeter() {

		int a = 5;
		int b = 7;
		int c = 11;
		int perimeter = a + b + c;

		System.out.println(perimeter);

	}

}
