package com.upskill.assignment_1;

public class Assignment_1_3 {

	/*
	 * Problem 03: A function which returns the multiply value of a and b where a =
	 * 9 and b = 11. Write a program which will display addition of a + b + function
	 * returns value.
	 */
	public static void main(String[] args) {

		myMethod3();
		int a = 9;
		int b = 11;
		int c = myMethod3();
		System.out.println(a + b + c);
	}

	public static int myMethod3() {
		int a = 9;
		int b = 11;
		int c = a * b;
		return c;
	}
}
