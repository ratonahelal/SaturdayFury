package com.upskill.assignment_1;

public class Assignment_1_2 {

	/*
	 * Problem 02: A rectangle's width and length are : 9 and 13 inches. Write a
	 * method to display the perimeter of rectangle in console output.
	 */

	public static void main(String[] args) {
		rectanglePerimeter();
	}

	public static void rectanglePerimeter() {

		int a = 9;
		int b = 13;
		int perimeter = 2 * (a + b);

		System.out.println(perimeter);
	}

}
