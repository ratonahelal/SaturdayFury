package com.upskill.assignment_1;

public class Subtraction {

	public static void main(String[] args) {

		/*
		 * A function returns 30, another function returns 50. Write a java program
		 * which will display subtraction value from bigger number to smaller.
		 */

		Hello();
		Hi();

		int x = Hello();
		int y = Hi();

		System.out.println(y - x);

	}

	public static int Hello() {
		return 30;
	}

	public static int Hi() {
		return 50;
	}

}
