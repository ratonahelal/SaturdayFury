package com.upskill.assignment_1;

public class Students {

	/*
	 * Problem 05: Write a java program which will display name and estimated age of
	 * every students in your class. (write separate method for every student).
	 */

	public static void main(String[] args) {

		Student1();
		Student2();
		Student3();

	}

	public static void Student1() {

		String name = "Raton";
		int age = 11;
		System.out.println("Name: " + name + ", Estimated Age: " + age);

	}

	public static void Student2() {
		String name = "Syed";
		int age = 10;
		System.out.println("Name: " + name + ", Estimated Age: " + age);
	}

	public static void Student3() {

		String name = "Sharmin";
		int age = 16;
		System.out.println("Name: " + name + ", Estimated Age: " + age);
	}
}
